package com.release.service;

import com.release.User;
import com.release.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yancheng
 * @since 2022/6/7
 */
@DubboService(version = "2.0")
public class UserServiceImpl2 implements UserService {

    public User getUser() {
        return new User().setAge(18)
                .setName("李四")
                .setPhoneNumber(18888888888L)
                .setSex("男");
    }
}
