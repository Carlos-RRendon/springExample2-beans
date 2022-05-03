package com.platzi.springproject;

import com.platzi.springproject.bean.MyBean;
import com.platzi.springproject.bean.MyBeanWithDependency;
import com.platzi.springproject.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprojectApplication implements CommandLineRunner {

	@Autowired
	private ComponentDependency componentDependency;

	@Autowired
	private MyBean myBean;

	@Autowired
	private MyBeanWithDependency myBeanWithDependency;

	public static void main(String[] args) {
		SpringApplication.run(SpringprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();

	}
}
