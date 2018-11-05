package cn.mahone.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/11/5 20:14
 */
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取请求上下文
        RequestContext ctx = RequestContext.getCurrentContext();   //路由前一直到路由后 在zuul内
        //获取request
        HttpServletRequest request = ctx.getRequest();
        //获取请求参数access-token
        String token = request.getParameter("access-token");
        //判断是否存在
        if (StringUtils.isBlank(token)){
            //不存在,未登录则拦截
            //默认是true
            ctx.setSendZuulResponse(false);
            //返回403
            ctx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
        }

        return null;
    }
}