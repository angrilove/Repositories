package com.jmx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class JmxServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 重启TOMCAT服务器
		this.doRestartTomcatService(req.getSession());
		resp.sendRedirect("/web/index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

	// PRIVATE METHOD ------------------------------------------------------
	
	/*
	 * 重启TOMCAT服务器
	 */
	private void doRestartTomcatService(HttpSession session) {
		Runtime runtime = Runtime.getRuntime();
		BufferedReader in = null;
		Process ps = null;
		String readLine = null;
		String message = (String) session.getAttribute("message");
		try {
			ps = runtime.exec("net stop Tomcat6");
			in = new BufferedReader(new InputStreamReader(ps.getInputStream(), "GBK"));
			while ((readLine = in.readLine()) != null) {
				if (message != null) {
					message += "<br>< " + new Date() + " > " + readLine;
				} else {
					message = "";
				}
			}
			ps = runtime.exec("net start Tomcat6");
			in = new BufferedReader(new InputStreamReader(ps.getInputStream(), "GBK"));
			while ((readLine = in.readLine()) != null) {
				if (message != null) {
					message += "<br>< " + new Date() + " > " + readLine;
				} else {
					message = "";
				}
			}
			session.setAttribute("message", message);
		} catch (IOException e) {
			e.printStackTrace();
			session.setAttribute("message", "启动失败！<br>栈信息：<br>" + e.getMessage());
		}
	}
	
}
