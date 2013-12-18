package com.loton;

import java.io.File;
import java.io.IOException;
import java.util.Date;
  
public class ExecFileUtil {  
    public static void main(String[] args) {
        try {
			ExecFileUtil.run("cmd /C start shutdown.bat", null, new File(
			        "D:\\Program Files\\Apache Software Foundation\\apache-tomcat-6.0.36\\bin"));
			System.out.println("< " + new Date() + " >" + " Apache Tomcat is stop SUCCESS!");
		} catch (IOException e) {
			System.out.println("< " + new Date() + " >" + " Apache Tomcat is stop ERROR!");
			e.printStackTrace();
		}
		
		try {
			ExecFileUtil.run("cmd /C start startup.bat", null, new File(
					"D:\\Program Files\\Apache Software Foundation\\apache-tomcat-6.0.36\\bin"));
			System.out.println("< " + new Date() + " >" + " Apache Tomcat is start SUCCESS!");
		} catch (IOException e) {
			System.out.println("< " + new Date() + " >" + " Apache Tomcat is start ERROR!");
			e.printStackTrace();
		}
    }
  
    /**
     * 这是一段中文注释
     * @param cmd COMMAND命令
     * @param envp 当前的执行环境
     * @param dir
     * @return
     * @throws IOException
     */
    public static Process run(String cmd, String[] envp, File dir) throws IOException {
        Runtime rt = Runtime.getRuntime();  
        return rt.exec(cmd, envp, dir);  
    }  
  
}
