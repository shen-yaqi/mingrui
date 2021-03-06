package com.mr.syq.service.fallback;

import com.mr.syq.entity.UserEntity;
import com.mr.syq.service.TestEurekaFeignService;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestEurekaFeignFallback
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/24
 * @Version V1.0
 **/
@Component//声明当前类是spring的组件
public class TestEurekaFeignFallback implements TestEurekaFeignService {
    @Override
    public String test(String name) {

        return null;
    }

    @Override
    public String test(UserEntity entity) {
        return "服务调用失败";
    }

    @Override
    public String testPost(UserEntity entity) {
        return null;
    }

    @Override
    public String testPut(UserEntity entity) {
        return null;
    }

    @Override
    public String testDel(String ids) {
        return null;
    }

    @Override
    public String method() {
        return null;
    }
}
