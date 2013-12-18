package anshen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 第三种配置SPRING MVC的方式
 * 参考：http://blog.springsource.com/2011/01/04/green-beans-getting-started-with-spring-mvc/
 * @author Anshen
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("HomeController: Passing through...");
		return "home";
	}
}
