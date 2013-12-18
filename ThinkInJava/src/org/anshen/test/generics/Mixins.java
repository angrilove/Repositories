package org.anshen.test.generics;

import java.util.Date;

/**
 * 混型
 * 
 * @author Anshen
 *
 */
public class Mixins {
	
	public static void main(String[] args) {
		Mixin m1 = new Mixin(),
				m2 = new Mixin();
		m1.set("test string 1");
		m2.set("test string 2");
		System.out.println(m1.get() + " " + m1.getStamp() + " " + m1.getSerialNumer());
		System.out.println(m2.get() + " " + m2.getStamp() + " " + m2.getSerialNumer());
	}

}

interface TimeStamped {
	long getStamp();
}

class TimeStampedImpl implements TimeStamped {

	private final long timeStamp;
	public TimeStampedImpl() {
		timeStamp = new Date().getTime();
	}
	@Override
	public long getStamp() {
		return timeStamp;
	}
	
}

interface SerialNumered {
	long getSerialNumer();
}

class SerialNumberedImpl implements SerialNumered {
	
	private static long counter = 1;
	private final long serialNumber = counter++;
	@Override
	public long getSerialNumer() {
		return serialNumber;
	}
	
}

interface Basic {
	public void set(String val);
	public String get();
}

class BasicImpl implements Basic {

	private String value;
	
	@Override
	public void set(String val) {
		value = val;
	}

	@Override
	public String get() {
		return value;
	}
	
}

class Mixin extends BasicImpl implements TimeStamped, SerialNumered {

	private TimeStamped timeStamped = new TimeStampedImpl();
	private SerialNumered serialNumbered = new SerialNumberedImpl();
	
	@Override
	public long getSerialNumer() {
		return serialNumbered.getSerialNumer();
	}

	@Override
	public long getStamp() {
		return timeStamped.getStamp();
	}
	
}
