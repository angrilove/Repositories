package org.anshen.test.generics;

import java.util.Date;

/**
 * 混合模式的装饰
 * 
 * @author Anshen
 *
 */
public class Decoration {
	
	public static void main(String[] args) {
		TimeStamp t = new TimeStamp(new Basics());
		TimeStamp t2 = new TimeStamp(new SerialNumber(new Basics()));
		
		SerialNumber s = new SerialNumber(new Basics());
		SerialNumber s2 = new SerialNumber(new TimeStamp(new Basics()));
	}

}

class Basics {
	private String value;

	public String get() {
		return value;
	}

	public void set(String value) {
		this.value = value;
	}
	
}

class Decorator extends Basics {
	protected Basics basics;
	public Decorator(Basics basics) {
		this.basics = basics;
	}
	
	public void set(String val) {
		basics.set(val);
	}

	public String get() {
		return basics.get();
	}
}

class TimeStamp extends Decorator {

	private final long timeStemp;
	
	public TimeStamp(Basics basics) {
		super(basics);
		timeStemp = new Date().getTime();
	}
	public long getStamp() {
		return this.timeStemp;
	}
	
}

class SerialNumber extends Decorator {
	private static long counter;
	private final long serialNumber = counter++;
	
	public SerialNumber(Basics basics) {
		super(basics);
	}
	
	public long getSerialNumber() {
		return this.serialNumber;
	}
	
}
