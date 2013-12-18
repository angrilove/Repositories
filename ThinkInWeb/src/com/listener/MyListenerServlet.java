package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListenerServlet implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Context Destroyed.");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("Context Initialized.");
	}
	
}
