package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point;

public class ReflectTest {

	@Test
	public void test() throws Exception, IllegalAccessException, NoSuchMethodException {
		Point p = Point.class.newInstance();
		System.out.println(p);
		Method m = Point.class.getMethod("setX", Integer.class);
		m.invoke(p, 10);
		System.out.println(p);

	}
}