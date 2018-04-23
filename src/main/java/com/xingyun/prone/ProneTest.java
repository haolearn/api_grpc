package com.xingyun.prone;

import io.grpc.Grpc;
import io.grpc.InternalStatus;

import java.util.HashSet;
import java.util.Set;

public class ProneTest {
    public static void main (String[] args) {
        Set<Short> s = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            // error prone探测错误,i+0转换成int，不符合参数short类型,s.remove((short)(i-1)) 可以
//            s.remove(i-1);
        }
        System.out.println(s.size());

// grpc-java-api-checker 探测错误
//        System.out.println(InternalStatus.MESSAGE_KEY);
// grpc-java-api-checker 探测错误
//        System.out.println(Grpc.TRANSPORT_ATTR_REMOTE_ADDR);
    }
}
