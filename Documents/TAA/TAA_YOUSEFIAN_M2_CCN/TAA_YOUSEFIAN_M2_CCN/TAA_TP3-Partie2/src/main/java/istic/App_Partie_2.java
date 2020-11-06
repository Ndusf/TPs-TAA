/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package istic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import istic.aop.Client.Client;
import istic.aop.service.AppService;
import istic.aop.service.HelloWorldService;

@SpringBootApplication
public class App_Partie_2 implements CommandLineRunner {

	// Simple example shows how an application can spy on itself with AOP

	@Autowired
	private AppService appService;

	private Client client;
	
	/**
	 * @param helloWorldService
	 * @param client
	 */
	public App_Partie_2(AppService appService, Client client) {
		this.appService = appService;
		this.client = client;
	}

	public void run(String... args) {
		this.appService.getAppServiceMessage();
		this.client.run();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App_Partie_2.class, args);
	}

}
