/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.creational.singleton;

/**
 * 单例模式，延迟创建。
 * 
 * @author Anshen
 *
 */
public final class SingletonPattern {

	private String id;
	private static SingletonPattern singletonPattern;
	
	private SingletonPattern(){}
	
	public static SingletonPattern initial() {
		if (singletonPattern == null) {
			singletonPattern = new SingletonPattern();
		}
		return singletonPattern;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
