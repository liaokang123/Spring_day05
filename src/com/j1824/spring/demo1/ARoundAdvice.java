package com.j1824.spring.demo1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ARoundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前置增强");
        Object proceed = methodInvocation.proceed();
        System.out.println("后置增强");
        return proceed;
        
    }
}
