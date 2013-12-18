package com.loton;

import java.io.IOException;
import java.util.Date;

public class ExecService {
	
	public static void main(String[] args) {
		java.lang.Process p = null;
		java.io.BufferedReader in = null;
		String s;
		String t = "成功停止";
		try {
			p = java.lang.Runtime.getRuntime().exec("net stop \"Tomcat6\"");
			in = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream(), "GBK"));
			while ((s = in.readLine()) != null) {
				if (s.indexOf(t) != -1) {
					break;
				}
				System.out.println("< " + new Date() + " > " +  s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			p = java.lang.Runtime.getRuntime().exec("net start \"Tomcat6\"");
			in = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream(), "GBK"));
			t = "启动成功";
			while ((s = in.readLine()) != null) {
				if (s.indexOf(t) != -1) {
					break;
				}
				System.out.println("< " + new Date() + " > " +  s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
