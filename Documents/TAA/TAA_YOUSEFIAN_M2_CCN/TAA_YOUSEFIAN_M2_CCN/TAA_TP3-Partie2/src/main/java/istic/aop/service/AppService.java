package istic.aop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppService {
	@Value("${name:World}")
	private String name;

	public String getAppServiceMessage() {
		return "APP " + this.name;
	}

}
