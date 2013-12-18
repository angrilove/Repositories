/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象池模式
 * 
 * @author Anshen
 *
 */
public class PoolManager {

	private static class PoolItem {
		boolean inUse = false;
		Object item;
		PoolItem(Object item) {this.item = item;}
	}
	
	private List<PoolItem> items = new ArrayList<PoolItem>();
	
	public void add(Object item) {
		items.add(new PoolItem(item));
	}
	
	@SuppressWarnings("serial")
	static class EmptyPoolException extends Exception {}
	
	public Object get() throws EmptyPoolException {
		for (int i = 0; i < items.size(); i++) {
			PoolItem pi = items.get(i);
			if (!pi.inUse) {
				pi.inUse = true;
				return pi.item;
			}
		}
		
		throw new EmptyPoolException();
	}
	
	public void release(Object item) {
		for (int i = 0; i < items.size(); i++) {
			PoolItem pi = (PoolItem) items.get(i);
			if (item == pi.item) {
				pi.inUse = false;
				return;
			}
		}
		throw new RuntimeException(item + " not found");
	}
}
