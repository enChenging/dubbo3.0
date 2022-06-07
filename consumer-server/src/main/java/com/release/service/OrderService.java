package com.release.service;

import com.release.User;
import com.release.UserService;
import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import sun.net.www.http.HttpClient;

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

    public User getOrder() {
//        return restTemplate.getForObject("http://localhost:8001/user", String.class);

        return userService.getUser();

//        userService.sayHelloServerStream("hello", new StreamObserver<String>() {
//            public void onNext(String data) {
//                System.out.println("接受结果：" + data);
//            }
//
//            public void onError(Throwable throwable) {
//
//            }
//
//            public void onCompleted() {
//
//            }
//        });
//        return new User();

//        StreamObserver<String> stringStreamObserver = userService.sayHelloStream(new StreamObserver<String>() {
//            public void onNext(String data) {
//                System.out.println(data);
//            }
//
//            public void onError(Throwable throwable) {
//
//            }
//
//            public void onCompleted() {
//
//            }
//        });
//        stringStreamObserver.onNext("1");
//        stringStreamObserver.onNext("2");
//        stringStreamObserver.onNext("3");
//        stringStreamObserver.onCompleted();
//        return "success";
    }
}
