package org.anshen.test;

import java.util.Enumeration;
import java.util.Properties;

import org.junit.Test;

public class OSTests {

	@Test
	public void osType() {
		Properties properties = System.getProperties();

		Enumeration<Object> eo = properties.keys();
		do {
			Object key = eo.nextElement();
			System.out.println(key.toString() + "," + properties.get(key));
		} while (eo.hasMoreElements());

		System.out.println(System.getProperty("os.version"));
	}

}
