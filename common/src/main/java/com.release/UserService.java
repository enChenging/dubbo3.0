package com.release;

import org.apache.dubbo.common.stream.StreamObserver;

/**
 * @author yancheng
 * @since 2022/6/7
 */
public interface UserService {

    //方式：UNARY
    public User getUser();

    //方式：SERVER_STREAM
//    default void sayHelloServerStream(String name, StreamObserver<String> response){
//    }

    //CLIENT_STREAM / BI_STREAM
//    default StreamObserver<String> sayHelloStream(StreamObserver<String> response){
//        return response;
//    }
}
