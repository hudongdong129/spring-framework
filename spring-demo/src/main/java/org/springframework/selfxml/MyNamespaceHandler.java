package org.springframework.selfxml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author hdd
 * @description:
 * @date 2024年01月28日
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
