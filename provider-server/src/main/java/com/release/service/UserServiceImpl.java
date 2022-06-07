package com.release.service;

import com.release.User;
import com.release.UserService;
import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yancheng
 * @since 2022/6/7
 */
@DubboService(version = "1.0")
public class UserServiceImpl implements UserService {

    public User getUser() {
        //只能返回一次业务
        return new User().setAge(20)
                .setName("张三")
                .setPhoneNumber(18888888888L)
                .setSex("男");
    }

    // SERVER_STREAM
//    public void sayHelloServerStream(String name, StreamObserver<String> response) {
//        //处理name
//        response.onNext("data1:" + name);
//        //处理name
//        response.onNext("data2:" + name);
//        //处理name
//        response.onNext("data3:" + name);
//
//        response.onCompleted();
//    }
//
//    public StreamObserver<String> sayHelloStream(final StreamObserver<String> response) {
//        return new StreamObserver<String>() {
//            public void onNext(String data) {
//                System.out.println("服务端接受到数据：" + data);
//
//                //处理data
//                response.onNext("响应结果：" + data);
//            }
//
//            public void onError(Throwable throwable) {
//
//            }
//
//            public void onCompleted() {
//                System.out.println("发送完成：");
//            }
//        };
//    }
}
