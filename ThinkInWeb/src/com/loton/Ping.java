package com.loton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ping {
	public static void main(String[] args) {
		String url = ";;;xs:学士;ss:硕士;b s         :博士;;";
		// 消除模式
		String regex = "(^;+|;+$|\\s+(?=:)|(?=:)\\s+)";
		
		// 
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(url);
		m.reset();
		String rs = m.replaceAll("");
		System.out.println(rs);
	}
	
}
