package org.acme.quickstart.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

	public String greetings(String name) {
		return "hello " + name;
	}
	
}

