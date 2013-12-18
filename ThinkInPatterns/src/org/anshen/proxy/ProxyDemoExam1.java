package org.anshen.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class NeatPropertyBundle {
	public String statusCode;
	public String message;
	public String callbackType;
	public String navTabId;
	public String forwardUrl;
	
	public NeatPropertyBundle(String filename) {
		Proxy.newProxyInstance(NeatPropertyBundle.class.getClassLoader(),
				new Class[] { NeatPropertyBundle.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						
						return null;
					}
				}
			);
	}
}

public class ProxyDemoExam1 {
	public static void main(String[] args) {
		NeatPropertyBundle prop = new NeatPropertyBundle("propertybundle.dat");
		
		System.out.println(prop.statusCode);
		System.out.println(prop.callbackType);
		System.out.println(prop.forwardUrl);
		System.out.println(prop.message);
		System.out.println(prop.navTabId);
	}
}
