package fr.barmes.sandbox.helloworld;

import org.apache.log4j.Logger;

/**
 * Main class for the helloworld project
 * @author fbarmes
 *
 */
public class HelloWorldRunner {

	private static final Logger LOGGER = Logger.getLogger(HelloWorldRunner.class);
	
	public static final void main(String[] args) {
		
		HelloWorld helloWorld = new HelloWorld();
		LOGGER.info(helloWorld.helloWorld());
	}
	
}
