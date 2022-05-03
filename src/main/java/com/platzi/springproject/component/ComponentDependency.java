package com.platzi.springproject.component;

import org.springframework.stereotype.Component;


public interface ComponentDependency {
    default void saludar(){}
}
