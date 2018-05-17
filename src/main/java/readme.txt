1、Spring的事件监听
	1.1、自定义事件，继承ApplicationEvent
	
	1.2、自定义事件监听器，实现ApplicationListener并指定泛型，即要监听的事件类型，具体参见MyEventApplicationEventListener
	
	1.3、装配事件监听器（四者选其一）：
		1.3.1、context.addApplicationListener(new MyEventApplicationEventListener());
		1.3.2、通过注解@Component进行装配
		1.3.3、通过在application.properties中添加：context.listener.classes=com.springboot.MyEventApplicationEventListener
			   	具体原理参照DelegatingApplicationListener的实现
		*******************以上三种方式都需要事先实现ApplicationListener接口来自定义事件监听类****************
		1.3.4、使用注解@EventListener方式，该注解用在方法上，并且该方法所属的类需要被Spring容器管理，这种方式可以事先不定义事件监听类，
				spring会通过扫描有@EventListener注解的方法，并自动生成事件监听类并注册到spring容器中，具体参见MyApplicationListenerConfig
				中的myApplicationListern(MyApplicationEvent myEvent)方法，该方法中的参数不可为空，该参数是什么类型的，就是监听指定类型的事
				件，如果是Object则会监听所有Spring事件
				具体原理参见：EventListenerMethodProcessor
				
	1.4、对于自定义的事件，需要手动的发布事件context.publishEvent(new MyApplicationEvent(new Object()));如果监听的是Spring容器定
		义的事件，则由容易按照相关规则进行触发，我们只需配置监听即可