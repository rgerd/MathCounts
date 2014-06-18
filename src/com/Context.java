package com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Super Context class. All Context classes should extend from this.
 */

public abstract class Context {
	private int type;
	
	public void generate(int type)
	{	
		this.setType(type);
		Class<?> cls = this.getClass();
		try {
			Method m = cls.getDeclaredMethod("gen" + type, new Class[0]);
			m.setAccessible(true);
			m.invoke(this);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private void setType(int t)
	{
		type = t;
	}

	public int getType()
	{
		return type;
	}
	
	public abstract int getAns();
}
