package org.anshen.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Prototype {
	void toLocalString();
	void regx(String str);
	String substring(int index, String str);
	
	String LOCAL_STRING = "PROTOTYPE_LOCAL_STRING";
}

public class DynamicProxyDemo {
	
	public static void main(String[] args) {
		Prototype proxy = (Prototype) Proxy.newProxyInstance(Prototype.class.getClassLoader(),
				new Class[] { Prototype.class }, new InvocationHandler() {
			
			@SuppressWarnings("static-access")
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) {
				System.out.println("Proxy Objectg called:" + ((Prototype) proxy).LOCAL_STRING);
				System.out.println("InvocationHandler called:" + "\n\tMethod = " + method);
				if (args != null) {
					System.out.println("\targs = ");
					for (int i = 0; i < args.length; i++) {
						System.out.println("\t\t" + args[i]);
					}
				}
				return null;
			}
		});
		
		proxy.toLocalString();
		proxy.regx("I'am fine, thanks.");
		proxy.substring(3, "you will leave me, sure!");
	}
}
