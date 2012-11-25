package fr.barmes.sandbox.helloworld;


/**
 * HelloWorld Class. Provides a method to say hello messages

 * @author fbarmes
 */
public class HelloWorld {

	
	private String prefix = null;
	private String suffix = null;
	private String space  = null; 
	
	
	private static final String DEFAULT_PREFIX = "Hello";
	private static final String DEFAULT_SUFFIX = "World !";
	private static final String DEFAULT_SPACE = " ";
	
	
	public HelloWorld() {
		this(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_SPACE);
	}
	
	
	public HelloWorld(String prefix, String suffix, String space) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.space = space;
	}




	/**
	 * Create the standard hello world message
	 * @return the hello world message
	 */
	public final String helloWorld() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getPrefix()).append(this.getSpace()).append(this.getSuffix());
		return sb.toString();
	}
	
	/**
	 * Say hello to name
	 * @param name the name to say hello to
	 * @return the hello message
	 */
	public final String sayHello(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getPrefix()).append(this.getSpace()).append(name);
		return sb.toString();
	}


	public String getPrefix() {
		return prefix;
	}


	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	public String getSuffix() {
		return suffix;
	}


	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}


	public String getSpace() {
		return space;
	}


	public void setSpace(String space) {
		this.space = space;
	}
	
}
