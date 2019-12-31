package cn.itcast.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext= RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("access-token");
        if(StringUtils.isBlank(token)){
            //过滤该请求，不对其路由
            requestContext.setSendZuulResponse(false);
            // 设置响应状态码，401
            requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            // 设置响应信息
            requestContext.setResponseBody("{\"status\":\"401\", \"text\":\"request error!\"}");
        }
        //放行，对此请求路由
        requestContext.set("token",token);
        return null;
    }
}
