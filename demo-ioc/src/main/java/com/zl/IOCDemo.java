package com.zl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);

		UserService bean = ac.getBean(UserService.class);

		System.out.println(bean);
	}
}
