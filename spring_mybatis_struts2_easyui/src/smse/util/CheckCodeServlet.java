package smse.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 5620502686018926499L;
	
	private static final String sessionKey = "checkcode";

	public static String getSessionKey() {
		return sessionKey;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("image/jpg");
		try {
			RandomGraphics g = new RandomGraphics();
			g.setCharLength(4);
			ServletOutputStream sos = res.getOutputStream();
			g.buildImage(sos);
			req.getSession().setAttribute(sessionKey, g.getCheckCode());
			sos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		super.doPost(req, res);
	}

}
