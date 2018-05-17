package com.springboot;

import org.springframework.context.ApplicationListener;

/**
 * 自定义ApplicationListener
 * @author Administrator
 *
 */
/*@Component*///2
public class MyEventApplicationEventListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("获得到事件：" + event.getClass().getName());
	}

}
