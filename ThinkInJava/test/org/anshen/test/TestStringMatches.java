package org.anshen.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestStringMatches {

	@Test
	public void stringMatchesTest() {
		String regex = "http://www.baidu.com/s?sid={id}&pid={pid}";
		try {
			boolean match = regex.matches("^\\w+$");
			System.out.println(match);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void patternTest() {
		String input = "http://www.baidu.com/s?sid={id}&pid={pid}";
		Map<String, String> attrs = new HashMap<String, String>();
		attrs.put("{id}", "id_1111");
		attrs.put("{pid}", "modal");
		
		for (String k : attrs.keySet()) {
			if (attrs.containsKey(k)) {
				input = input.replace(k, attrs.get(k));
				System.out.println(input);
			}
			System.out.println(k + "----" + attrs.get(k));
		}

		System.out.println(input);

	}

	@Test
	public void listContainsTest() {
		List<String> l = new ArrayList<String>();
		l.add("rrr");
		l.add("111");
		l.add("anshen");
		System.out.println(l.contains("anshen"));
	}
	
	@Test
	public void testValueOfAndCase() {
		
		String str = null;
		String r1 = String.valueOf(str);
		String r2 = (String) str;
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(String.valueOf(str));
		System.out.println((String) str);
	}
	
}
