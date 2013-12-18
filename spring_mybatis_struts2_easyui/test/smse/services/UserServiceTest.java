package smse.services;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smse.service.IUserService;

public class UserServiceTest {
	
	@Test
	public void userServiceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService userService = (IUserService) context.getBean("userService");
		
		System.out.println(userService.getTotalCount());
	}
	
}
