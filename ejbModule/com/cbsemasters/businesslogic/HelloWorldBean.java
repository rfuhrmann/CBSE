package com.cbsemasters.businesslogic;

import com.cbsemasters.business.HelloWorld;
import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorld {
    public HelloWorldBean() {
    }

	public String sayHello() {
		return "Hello World !!!";
	}
}