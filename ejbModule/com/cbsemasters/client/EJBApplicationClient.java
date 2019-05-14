package com.cbsemasters.client;

import javax.naming.Context;
import javax.naming.NamingException;
import com.cbsemasters.business.HelloWorld;
import com.cbsemasters.clientutility.ClientUtility;

public class EJBApplicationClient {
	private static final String LOOKUP_STRING = "HelloWorldBean/remote";

	public static void main(String[] args) {
		HelloWorld bean = doLookup();
		// 3. Call business logic
		System.out.println(bean.sayHello());
	}

	private static HelloWorld doLookup() {
		Context context = null;
		HelloWorld bean = null;
		try {
			// 1. Obtaining Context
			context = ClientUtility.getInitialContext();
			// 2. Lookup and cast
			bean = (HelloWorld) context.lookup(LOOKUP_STRING);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return bean;
	}
}