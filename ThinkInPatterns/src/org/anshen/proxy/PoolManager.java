/*
 * ThinkInPatterns
 * Anshen Written (at) 11/2012
 */
package org.anshen.proxy;

import java.util.ArrayList;
import java.util.List;

public class PoolManager {
	private static class PoolItem {
		boolean inUse = false;
		Object item;
		PoolItem(Object item) {
			this.item = item;
		}
	}
	
	public class ReleasableReference {
		private PoolItem reference;
		private boolean released = false;
		public ReleasableReference(PoolItem reference) {
			this.reference = reference;
		}
		
		public Object getReference() {
			if (released) {
				throw new RuntimeException("Tried to use reference after it was released.");
			}
			return reference.item;
		}
		
		public void release() {
			released = true;
			reference.inUse = false;
		}
	}
	
	private List<PoolItem> items = new ArrayList<PoolItem>();
	
	public void add(Object item) {
		items.add(new PoolItem(item));
	}
	
	public static class EmptyPoolItem {}
	
	public ReleasableReference get() {
		for (int i = 0, length = items.size(); i < length; i++) {
			PoolItem pi = items.get(i);
			if (!pi.inUse) {
				pi.inUse = true;
				return new ReleasableReference(pi);
			}
		}
		return null;
	}
}
