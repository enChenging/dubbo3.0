package com.release.service;

import com.release.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yancheng
 * @since 2022/6/7
 */
@DubboService(version = "1.0")
public class UserServiceImpl implements UserService {

    public String getUser() {
        return "com.release-provider1.0";
    }
}
