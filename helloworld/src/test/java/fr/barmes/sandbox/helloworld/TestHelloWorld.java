package fr.barmes.sandbox.helloworld;

import junit.framework.Assert;

import org.junit.Test;

public class TestHelloWorld {

	@Test
	public void testHelloWorld() {
		String expected = "Hello World !";
		Assert.assertEquals(expected, HelloWorld.helloWorld());
	}

	@Test
	public void testSayHello() {
		String expected = "Hello fred";
		Assert.assertEquals(expected, HelloWorld.sayHello("fred"));
	}

}
