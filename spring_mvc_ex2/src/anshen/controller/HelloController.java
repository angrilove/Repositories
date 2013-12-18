package anshen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 控制器
 * 参考：http://www.ideawu.net/person/spring_mvc.html
 * 
 * @author Anshen
 *
 */
public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// 参数
		request.setAttribute("hello", "第二种配置SPRING MVC的方式");
		
		return new ModelAndView("hello");
	}

}
