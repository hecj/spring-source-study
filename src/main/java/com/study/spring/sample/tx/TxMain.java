package com.study.spring.sample.tx;

import com.study.spring.sample.tx.entity.User;
import com.study.spring.sample.tx.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.study.spring.sample.tx")
@ImportResource("classpath:application-tx.xml")
@EnableTransactionManagement
public class TxMain {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxMain.class);) {
			User user = new User();
			user.setId("1234564");
			user.setUserName("he-666666666");

			UserService userService = context.getBean(UserService.class);
			userService.insertUser(user);
		}
	}
}
