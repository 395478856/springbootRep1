-- 设置当前年份
SET @cur_year=(SELECT Year(Now()));

-- cz_codeset_division，cz_codeset_item增加年度
ALTER TABLE cz_codeset_division
  ADD lastyear_division_id INT DEFAULT 0;

CREATE INDEX idx_ccd_ldi
  ON cz_codeset_division(lastyear_division_id);

INSERT INTO cz_codeset_division
            (cz_codeset_id,
             year,
             items,
             district,
             lastyear_division_id)
SELECT cz_codeset_id,
       year + 1,
       items,
       district,
       cz_codeset_division_id
FROM   cz_codeset_division
WHERE  year = @cur_year;

INSERT INTO cz_codeset_item
            (cz_codeset_id,
             cz_codeset,
             cz_codeset_division_id,
             year,
             district,
             code,
             name,
             time_released,
             cz_code)
SELECT cci.cz_codeset_id,
       cci.cz_codeset,
       ccd.cz_codeset_division_id,
       cci.year + 1,
       cci.district,
       cci.code,
       cci.name,
       Now(),
       Replace(cci.cz_code, Concat('|', cci.year, '|'), Concat('|', cci.year + 1, '|'))
FROM   cz_codeset_item cci
       LEFT JOIN cz_codeset_division ccd
              ON cci.cz_codeset_id = ccd.cz_codeset_id
                 AND cci.district = ccd.district
                 AND ccd.year = cci.year + 1
WHERE  cci.year = @cur_year;

UPDATE cz_codeset_item
SET    cz_code = Concat(code, '|', data_version, '|', year, '|', district, '|', cz_codeset)
WHERE  year >= @cur_year;


-- zcy_codeset_division，zcy_codeset_item增加年度
ALTER TABLE zcy_codeset_division
  ADD lastyear_division_id INT DEFAULT 0;

CREATE INDEX idx_zcd_ldi
  ON zcy_codeset_division(lastyear_division_id);

INSERT INTO zcy_codeset_division
            (zcy_codeset_id,
             year,
             items,
             district,
             lastyear_division_id)
SELECT zcy_codeset_id,
       year + 1,
       items,
       district,
       zcy_codeset_division_id
FROM   zcy_codeset_division
WHERE  year = @cur_year;

INSERT INTO zcy_codeset_item
            (zcy_codeset_id,
             zcy_codeset,
             zcy_codeset_division_id,
             year,
             district,
             code,
             name,
             zcy_code)
SELECT zci.zcy_codeset_id,
       zci.zcy_codeset,
       zcd.zcy_codeset_division_id,
       zci.year + 1,
       zci.district,
       zci.code,
       zci.name,
       Replace(zci.zcy_code, Concat('|', zci.year, '|'), Concat('|', zci.year + 1, '|'))
FROM   zcy_codeset_item zci
       LEFT JOIN zcy_codeset_division zcd
              ON zci.zcy_codeset_id = zcd.zcy_codeset_id
                 AND zci.district = zcd.district
                 AND zcd.year = zci.year + 1
WHERE  zci.year = @cur_year;


-- codeset_mapping表增加年度
ALTER TABLE codeset_mapping
	ADD COLUMN lastyear_mapping_id int DEFAULT 0;

CREATE INDEX idx_codeset_mapping_lmi ON codeset_mapping (lastyear_mapping_id);

INSERT INTO codeset_mapping (cz_codeset_id, cz_year, zcy_codeset_id, zcy_year, time_mapped
	, cz_codeset_division_id, zcy_codeset_division_id, cz_district, zcy_district, lastyear_mapping_id)
SELECT cm.cz_codeset_id, cm.cz_year + 1, cm.zcy_codeset_id
	, IF(cm.zcy_year > 0, cm.zcy_year + 1, 0)
	, now(), ccd.cz_codeset_division_id
	, IF(cm.zcy_year > 0, zcd.zcy_codeset_division_id, cm.zcy_codeset_division_id)
	, cm.cz_district, cm.zcy_district, cm.codeset_mapping_id
FROM codeset_mapping cm
	LEFT JOIN cz_codeset_division ccd ON cm.cz_codeset_division_id = ccd.lastyear_division_id
	LEFT JOIN zcy_codeset_division zcd ON cm.zcy_codeset_division_id = zcd.lastyear_division_id
WHERE cm.cz_year = @cur_year
	AND cm.zcy_codeset_division_id > 0;


-- code_relation增加年度
ALTER TABLE code_relation
	ADD COLUMN lastyear_relation_id int DEFAULT 0;

CREATE INDEX idx_code_relation_lri ON code_relation (lastyear_relation_id);

INSERT INTO code_relation (cz_code, cz_codeset_year, cz_code_version, zcy_code, zcy_codeset_year
	, zcy_code_version, codeset_mapping_id, zcy_codeset_district_year, cz_codeset_id, zcy_codeset_id
	, cz_codeset_item_id, lastyear_relation_id)
SELECT replace(cr.cz_code, concat('|', @cur_year, '|'), concat('|', @cur_year + 1, '|'))
	, replace(cr.cz_codeset_year, concat('-', @cur_year), concat('-', @cur_year + 1))
	, cr.cz_code_version
	, replace(cr.zcy_code, concat('|', @cur_year, '|'), concat('|', @cur_year + 1, '|'))
	, replace(cr.zcy_codeset_year, concat('-', @cur_year), concat('-', @cur_year + 1))
	, cr.zcy_code_version, cm.codeset_mapping_id
	, replace(cr.zcy_codeset_district_year, concat('-', @cur_year), concat('-', @cur_year + 1))
	, cr.cz_codeset_id, cr.zcy_codeset_id, cci.cz_codeset_item_id, cr.relation_id
FROM code_relation cr
	LEFT JOIN codeset_mapping cm ON cr.codeset_mapping_id = cm.lastyear_mapping_id
	LEFT JOIN cz_codeset_item cci ON replace(cr.cz_code, concat('|', @cur_year, '|'), concat('|', @cur_year + 1, '|')) = cci.cz_code
WHERE cr.cz_codeset_year LIKE concat('%-', @cur_year);


--  codeset_mapping_category增加年度
INSERT INTO codeset_mapping_category (codeset_mapping_id, relation_id, cz_codeset_item_id, category_code, category_name
	, time_released, year)
SELECT cm.codeset_mapping_id, cr.relation_id, cr.cz_codeset_item_id, cmc.category_code, cmc.category_name
	, now(), @cur_year + 1
FROM codeset_mapping_category cmc
	LEFT JOIN codeset_mapping cm ON cmc.codeset_mapping_id = cm.lastyear_mapping_id
	LEFT JOIN code_relation cr ON cmc.relation_id = cr.lastyear_relation_id
WHERE cmc.year = @cur_year;

-- 清除codeset_mapping_category增加年度后的冗余数据
-- SET @cur_year = (
-- 	SELECT year(now())
-- );
--
-- DELETE FROM codeset_mapping_category
-- WHERE relation_id IS NULL
-- 	AND year = @cur_year

-- 删除冗余列
ALTER TABLE cz_codeset_division DROP COLUMN lastyear_division_id;
ALTER TABLE zcy_codeset_division DROP COLUMN lastyear_division_id;
ALTER TABLE codeset_mapping DROP COLUMN lastyear_mapping_id;
ALTER TABLE code_relation DROP COLUMN lastyear_relation_id;
