package com.j1824.spring.demo1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("记录日志");
    }
}
