package cn.itcast.mybatis.generator;

import cn.itcast.mybatis.generator.mapper.AgProtocolMapper;
import cn.itcast.mybatis.generator.mapper.AgProtocolQualificationMapper;
import cn.itcast.mybatis.generator.model.AgProtocol;
import cn.itcast.mybatis.generator.model.AgProtocolQualification;
import cn.itcast.mybatis.generator.vo.AgProtocolQualificationVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MybatisGeneratorApplicationTests {
    @Autowired
    private AgProtocolMapper agProtocolMapper;
    @Autowired
    private AgProtocolQualificationMapper agProtocolQualificationMapper;

    @Test
    public void test1() {
        String[] deliverIds = {
                "900102", "900199", "900101", "900103", "900104", "900105", "900106", "900107", "900099", "900499", "900401", "900402", "900403", "900404", "900405", "900406", "900407", "900408", "900409", "900410", "900411", "900412", "900413", "900414", "900415", "900416", "900302", "900399", "900301", "900303", "900304", "900305", "900306", "900307", "900308", "900309", "900310", "900311", "900312", "900313", "900314", "900315", "900316", "900202", "900299", "900201", "900203", "900204", "900205", "900206", "900207", "900208", "900209", "900210", "900599", "900501", "900502", "900503", "900504", "900505", "900506", "900507", "900508", "900509", "900699", "900601", "900602", "900603", "900604", "900605", "900606", "900607", "900608", "900799", "900701", "900702", "900703", "900704", "900705", "900706", "900707", "900708", "900709", "900710", "900711", "900712", "900899", "900801", "900802", "900803", "900804", "900805", "900806", "900807", "900999", "900901", "900902", "900903", "900904", "900905", "900906", "900907", "900908", "900909", "901099", "901001", "901002", "901003", "901004", "901005", "901006", "901007", "901199", "901101", "901102", "901103", "901104", "901105", "901106", "901107", "901108", "901109", "901110", "901111", "901112", "901113", "901114", "901115", "901301", "901401", "901501", "901601", "901701", "901299", "901801", "901901"
        };
        System.out.println(deliverIds.length);
    }

    @Test
    public void test2() {
        String[] deliverIds = {
                "900102", "900199", "900101", "900103", "900104", "900105", "900106", "900107", "900099", "900499", "900401", "900402", "900403", "900404", "900405", "900406", "900407", "900408", "900409", "900410", "900411", "900412", "900413", "900414", "900415", "900416", "900302", "900399", "900301", "900303", "900304", "900305", "900306", "900307", "900308", "900309", "900310", "900311", "900312", "900313", "900314", "900315", "900316", "900202", "900299", "900201", "900203", "900204", "900205", "900206", "900207", "900208", "900209", "900210", "900599", "900501", "900502", "900503", "900504", "900505", "900506", "900507", "900508", "900509", "900699", "900601", "900602", "900603", "900604", "900605", "900606", "900607", "900608", "900799", "900701", "900702", "900703", "900704", "900705", "900706", "900707", "900708", "900709", "900710", "900711", "900712", "900899", "900801", "900802", "900803", "900804", "900805", "900806", "900807", "900999", "900901", "900902", "900903", "900904", "900905", "900906", "900907", "900908", "900909", "901099", "901001", "901002", "901003", "901004", "901005", "901006", "901007", "901199", "901101", "901102", "901103", "901104", "901105", "901106", "901107", "901108", "901109", "901110", "901111", "901112", "901113", "901114", "901115", "901301", "901401", "901501", "901601", "901701", "901299", "901801", "901901"
        };
        List<AgProtocol> agProtocols = agProtocolMapper.select(null);
        System.out.println(agProtocols.size());
        Map<Long, List<String>> map = new HashMap<>();
        AgProtocolQualificationVo vo = null;
        for (AgProtocol agProtocol : agProtocols) {
            vo = new AgProtocolQualificationVo();
            vo.setProtocolId(agProtocol.getId());
            vo.setIsDeleted(false);
            List<AgProtocolQualification> agProtocolQualifications = agProtocolQualificationMapper.selectByVo(vo);
//            System.out.println(agProtocolQualifications.size());
            List<String> strList = new ArrayList<>();
            for (String deliverId : deliverIds) {
                //deliverId是否存在标志，刚开始假设deliverId不存在
                boolean flag = false;
                for (AgProtocolQualification agProtocolQualification : agProtocolQualifications) {
                    if (deliverId.equals(agProtocolQualification.getDeliverId())) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    strList.add(deliverId);
                }
            }
            map.put(agProtocol.getId(), strList);
        }
        System.out.println(map);
        for (Map.Entry<Long, List<String>> entry : map.entrySet()) {

            AgProtocol agProtocol = agProtocolMapper.selectByPrimaryKey(entry.getKey());
            List<String> delivers = entry.getValue();

            vo = new AgProtocolQualificationVo();
            vo.setProtocolId(agProtocol.getId());
            vo.setIsDeleted(false);
            AgProtocolQualification APQTemplate = agProtocolQualificationMapper.selectByVo(vo).get(0);
            AgProtocolQualification newAPQ = new AgProtocolQualification();
            newAPQ.setProtocolId(APQTemplate.getProtocolId());
            newAPQ.setProtocolName(APQTemplate.getProtocolName());
            newAPQ.setSupplierCode(APQTemplate.getSupplierCode());
            newAPQ.setSupplierName(APQTemplate.getSupplierName());
            newAPQ.setDeliverType(APQTemplate.getDeliverType());
            newAPQ.setFromDistrictId(APQTemplate.getFromDistrictId());
            newAPQ.setFromOrgId(APQTemplate.getFromOrgId());
            newAPQ.setFromOrgName(APQTemplate.getFromOrgName());
            newAPQ.setApprovalOrgId(APQTemplate.getApprovalOrgId());
            newAPQ.setApprovalOrgName(APQTemplate.getApprovalOrgName());
            newAPQ.setSource(APQTemplate.getSource());
            newAPQ.setBizType(APQTemplate.getBizType());
            newAPQ.setTrait(APQTemplate.getTrait());
            newAPQ.setState(APQTemplate.getState());
            newAPQ.setApprovalComment(APQTemplate.getApprovalComment());
            newAPQ.setIsDeleted(APQTemplate.getIsDeleted());
            newAPQ.setCreator(APQTemplate.getCreator());
            newAPQ.setModifier(APQTemplate.getModifier());
            newAPQ.setProtocolType(APQTemplate.getProtocolType());
            newAPQ.setNetId(APQTemplate.getNetId());
            newAPQ.setContactName(APQTemplate.getContactName());
            newAPQ.setContactPhone(APQTemplate.getContactPhone());
            newAPQ.setInstanceCode(APQTemplate.getInstanceCode());

            for (String deliver : delivers) {
                newAPQ.setGmtCreated(new Date());
                newAPQ.setGmtModified(new Date());
                newAPQ.setDeliverId(deliver);
                agProtocolQualificationMapper.insertUseGeneratedKeys(newAPQ);
            }

        }
    }

}
