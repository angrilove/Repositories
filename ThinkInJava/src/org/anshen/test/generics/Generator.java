package org.anshen.test.generics;

/**
 * 泛型接口
 * 
 * @author Anshen
 *
 * @param <T>
 */
public interface Generator<T> {
	
	public T next();
	
}

class Customer {
	
	private static long counter = 1;
	private final long id = counter++;
	
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {

			@Override
			public Customer next() {
				return new Customer();
			}
			
		};
	}
}
