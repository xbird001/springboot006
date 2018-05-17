package com.springboot;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListenerConfig {
	
	@EventListener
	public void myApplicationListern(MyApplicationEvent myEvent) {
		System.out.println("获得到事件：" + myEvent.getClass().getName());
	}
	
	
	@EventListener
	public void contextClosedListener(ContextClosedEvent contextClosedEvent) {
		System.out.println("获得到事件：" + contextClosedEvent.getClass().getName());
	}

}
