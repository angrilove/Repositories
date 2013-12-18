package com.loton;

import java.io.IOException;

public class Psd {
	
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("cmd.exe /C D:\\Program\" \"Files\\apache-tomcat-6.0.36\\bin\\startup.bat");
		} catch (IOException e) {
			e.printStackTrace();
		}
//		Psd.restartComputer();
	}
	
	public static void restartComputer(){
		try {
			Process pcss = Runtime.getRuntime().exec("shutdown -r -t 0 -c \"关闭计算机。。。\" /");
			pcss.getErrorStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
