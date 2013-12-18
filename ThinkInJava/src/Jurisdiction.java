
public abstract class Jurisdiction {

	private String privateField;
	private static String privateStaticField;
	private final String privateFinalField = "xxx";
	private final static String privateFinalStaticField = "xxx";
	private transient String privateTransientField;
	private volatile String privateVolatileField;

	String defaultField;
	static String defaultStaticField;
	final String defaultFinalField = "";

	protected String protectedField;
	protected static String protectedStaticField;

	public String publicField;
	public static String publicStaticField;

	/// ------------
	private void privateMethod() {}
	private static void privateStaticMethod() {}
	private final void privateFinalMethod() {}
	private final static void privateFinalStaticMethod() {}
	private synchronized void privateSynchronizedMethod() {}
	private native void privateNativeMethod();

	void defaultMethod() {}
	static void defaultStaticMethod() {}
	abstract void defaultAbstractMethod();

	protected void protectedMethod() {}
	protected static void protectedStaticMethod() {}

	public void publicMetod() {}
	public static void publicStaticMetod() {}

}
