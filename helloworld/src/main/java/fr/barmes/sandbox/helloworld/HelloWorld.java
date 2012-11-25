package fr.barmes.sandbox.helloworld;


/**
 * HelloWorld Class. Provides a method to say hello messages

 * @author fbarmes
 */
public class HelloWorld {

	
	private static final String PREFIX = "Hello";
	private static final String SUFFIX = "World !";
	private static final String SPACE = " ";
	
	/**
	 * Create the standard hello world message
	 * @return the hello world message
	 */
	public static final String helloWorld() {
		StringBuffer sb = new StringBuffer();
		sb.append(PREFIX).append(SPACE).append(SUFFIX);
		return sb.toString();
	}
	
	/**
	 * Say hello to name
	 * @param name the name to say hello to
	 * @return the hello message
	 */
	public static String sayHello(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append(PREFIX).append(SPACE).append(name);
		return sb.toString();
	}
	
}
