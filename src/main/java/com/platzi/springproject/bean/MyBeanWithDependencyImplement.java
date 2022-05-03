package com.platzi.springproject.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    @Autowired
    private MyOperation myOperation;

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
