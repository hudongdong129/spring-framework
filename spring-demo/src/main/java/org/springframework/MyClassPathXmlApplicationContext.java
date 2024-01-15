package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hdd
 * @description: 自定义spring容器
 * @date 2023年12月25日
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		super.initPropertySources();
		getEnvironment().setRequiredProperties("VAR");
	}
}
