package core;

public class symbol {

	private String name;

	private symbol(String n) {
		name = n;
	}

	public String toString() {
		return name;
	}

	private static java.util.Dictionary<String, symbol> dict = new java.util.Hashtable<String, symbol>();

	/**
	 * Make return the unique symbol associated with a string. Repeated calls to
	 * <tt>symbol("abc")</tt> will return the same Symbol.
	 */
	public static symbol symbol(String n) {
		String u = n.intern();
		symbol s = dict.get(u);
		if (s == null) {
			s = new symbol(u);
			dict.put(u, s);
		}
		return s;
	}
}