package smse.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class UserFilter implements Filter {

	public void destroy() {

	}

	/**
	 * 这里判断用户是否存在
	 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		// HttpSession session = request.getSession();
		
		chain.doFilter(request, res);
		System.out.println("doFilter..");
		
//		if (session.getAttribute("user") == null) {
//			res.setCharacterEncoding("UTF-8");
//			String pstrScript = "<script language='javascript'>";
//			pstrScript += "alert('您已经与服务器断开连接，请重新登录！');";
//			pstrScript += "window.top.location='/JXWMTB/pages/last_login.jsp';";
//			pstrScript += "</script>";
//			res.getWriter().print(pstrScript);
//		} else {
//			chain.doFilter(request, res);
//		}
	}

	public void init(FilterConfig config) throws ServletException { }

}
