/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.creational.singleton;

/**
 * 单例模式，预创建。
 * 
 * @author Anshen
 *
 */
public final class Singleton {
	
	private String id;
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton initial() {
		return singleton;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
