package com.cbsemasters.business;
import javax.ejb.Remote;

@Remote
public interface HelloWorld {
	public String sayHello();
}