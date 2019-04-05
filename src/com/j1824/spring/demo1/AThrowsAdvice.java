package com.j1824.spring.demo1;

import org.springframework.aop.ThrowsAdvice;

public class AThrowsAdvice implements ThrowsAdvice {
    public void  afterThrowing(Exception ex){
        System.out.println("程序异常"+ex.getMessage()
        );
    }
}
