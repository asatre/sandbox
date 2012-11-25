package fr.barmes.sandbox.helloworld;

import junit.framework.Assert;

import org.junit.Test;

public class TestHelloWorld {

	@Test
	public void testHelloWorld() {
		String expected = "Hello World !";
		
		HelloWorld helloWorld = new HelloWorld();
		
		Assert.assertEquals(expected, helloWorld.helloWorld());
	}

	@Test
	public void testSayHello() {
		String expected = "Hello fred";
		HelloWorld helloWorld = new HelloWorld();
		Assert.assertEquals(expected, helloWorld.sayHello("fred"));
	}

}
