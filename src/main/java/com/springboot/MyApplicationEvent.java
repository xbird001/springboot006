package com.springboot;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3900482290363641445L;

	
	public MyApplicationEvent(Object source) {
		super(source);
	}

}
