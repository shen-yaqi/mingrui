package com.mr.syq.com.mr.syq.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TockenFilter
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/24
 * @Version V1.0
 **/
@Component// 声明当前类是一个spring的组件(受spring管理)
public class TockenFilter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(TockenFilter.class);

    //过滤器的类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    //过滤器执行顺序(多过滤器的情况)
    @Override
    public int filterOrder() {
        return 0;
    }
    //返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关。在上例中，我们直接返回true，所以该过滤器总是生效
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext context = RequestContext.getCurrentContext();

        HttpServletRequest request = context.getRequest();

        logger.info(request.getRequestURL() + ":" + request.getMethod());

        String tocken = request.getParameter("tocken");

        if(StringUtils.isEmpty(tocken)){
            logger.warn("tocken is null");
            context.setSendZuulResponse(false);//默认值为true
            context.setResponseStatusCode(401);
            return null;
        }

        logger.info("tocken is ok");
        return null;
    }
}
