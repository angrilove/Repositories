/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.creational.singleton;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 单例模式测试
 * 
 * @author Anshen
 *
 */
public class SingletonTest {

	@Test
	public void singletonTest() {
		Singleton sgl = Singleton.initial();
		Singleton slt = Singleton.initial();
		Assert.assertEquals(sgl, slt);
	}
	
	@Test
	public void singletonPatternTest() {
		SingletonPattern sgl = SingletonPattern.initial();
		SingletonPattern slt = SingletonPattern.initial();
		Assert.assertEquals(sgl, slt);
	}
	
	@Test
	public void SingletonRegistryLookup() {
		
	}
	
}
