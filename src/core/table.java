package core;

class Binder {
	Object value;
	symbol prevtop;
	Binder tail;

	Binder(Object v, symbol p, Binder t) {
		value = v;
		prevtop = p;
		tail = t;
	}
}

/**
 * The Table class is similar to java.util.Dictionary, except that each key must
 * be a Symbol and there is a scope mechanism.
 */

public class table {

	private java.util.Dictionary<symbol, Binder> dict = new java.util.Hashtable<symbol, Binder>();
	private symbol top = null;
	private Binder marks = null;

	/**
	 * Gets the object associated with the specified symbol in the Table.
	 */
	public Object get(symbol key) {
		Binder e = dict.get(key);
		if (e == null)
			return null;
		else
			return e.value;
	}

	/**
	 * Puts the specified value into the Table, bound to the specified Symbol.
	 */
	public void put(symbol key, Object value) {
		dict.put(key, new Binder(value, top, dict.get(key)));
		top = key;
	}

	/**
	 * Remembers the current state of the Table.
	 */
	public void beginScope() {
		marks = new Binder(null, top, marks);
		top = null;
	}

	/**
	 * Restores the table to what it was at the most recent beginScope that has
	 * not already been ended.
	 */
	public void endScope() {
		while (top != null) {
			Binder e = dict.get(top);
			if (e.tail != null)
				dict.put(top, e.tail);
			else
				dict.remove(top);
			top = e.prevtop;
		}
		top = marks.prevtop;
		marks = marks.tail;
	}

	/**
	 * Returns an enumeration of the Table's symbols.
	 */
	public java.util.Enumeration<symbol> keys() {
		return dict.keys();
	}
}