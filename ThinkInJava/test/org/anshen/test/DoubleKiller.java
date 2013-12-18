package org.anshen.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Test;

public class DoubleKiller {
	
	@Test
	public void showDoubleKiller() {
		// 0.40000000000000036
		System.out.println(10.00 - 9.60);
		
		System.out.println((10.00 * 100 - 9.60 * 100) / 100);
		
		BigDecimal dividend = new BigDecimal(10);
		BigDecimal divisor = new BigDecimal(9.6);
		DecimalFormat d;
		try {
//			System.out.println(dividend.(divisor));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.fail();
	}
	
	@Test
	public void max() {
		System.out.println("byte->" + Byte.MAX_VALUE);
		System.out.println("char->" + Character.MAX_VALUE);
		System.out.println("short->" + Short.MAX_VALUE);
		System.out.println("int->" + Integer.MAX_VALUE);
		System.out.println("long->" + Long.MAX_VALUE);
		System.out.println("float->" + Float.MAX_VALUE);
		System.out.println("double->" + Double.MAX_VALUE);
		
//		System.out.println("boolean->" + Boolean.);
		System.out.println();
		System.out.println("byte->" + Byte.MIN_VALUE);
		System.out.println("char->" + Character.MIN_VALUE);
		System.out.println("short->" + Short.MIN_VALUE);
		System.out.println("int->" + Integer.MIN_VALUE);
		System.out.println("long->" + Long.MIN_VALUE);
		System.out.println("float->" + Float.MIN_VALUE);
		System.out.println("double->" + Double.MIN_VALUE);
		
		System.out.println();
		System.out.println("float->" + Float.MIN_NORMAL);
		System.out.println("double->" + Double.MIN_NORMAL);
	}
	
}
