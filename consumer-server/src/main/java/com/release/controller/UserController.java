package com.release.controller;

import com.release.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.release.service.OrderService;

import javax.annotation.Resource;

/**
 * @author yancheng
 * @since 2022/6/7
 */
@RestController
public class UserController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order")
    public User getUser(){
        return orderService.getOrder();
    }
}
