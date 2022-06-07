package com.release.service;

import com.release.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author yancheng
 * @since 2022/6/7
 */
@Service
public class OrderService {

//    @Resource
//    private RestTemplate restTemplate;

    @DubboReference(version = "1.0")
    private UserService userService;

    public String getOrder(){
//        return restTemplate.getForObject("http://localhost:8001/user", String.class);

        return userService.getUser();
    }
}
