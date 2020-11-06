
package istic.TAA_TP3.Partie_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import istic.TAA_TP3.Partie_1.Client.Client;
import istic.TAA_TP3.Partie_1.Client.IRun;

@SpringBootApplication
public class App_Partie1 implements CommandLineRunner {

	// Simple example shows how a command line spring application can execute an
	// injected bean service. Also demonstrates how you can use @Value to inject
	// command line args ('--name=whatever') or application properties

	@Autowired
	//private HelloWorldService helloWorldService;
	private IRun irun;
		
		
	/**
	 * @param helloWorldService
	 * @param client
	 */
	public App_Partie1(IRun irun) {
		super();
		this.irun = irun;
	}

	public void run(String... args) {
		this.irun.run();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App_Partie1.class, args);
	}
	
	

}
