package com.examples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest1 {
	@BeforeClass
	public static void beforeclassTest() {
		System.out.println("This is from beforeclass block");
	}
@Before
public void beforeTest() {
	System.out.println("This is from before block");
}
@Test
public void test1() {
	System.out.println("this is from test1 block");
}
@Test
public void test2() {
	System.out.println("this is from test2 block");
}
@After
public void after() {
	System.out.println("This is from after block");
}
@AfterClass
public static void afterclass() {
	System.out.println("This is from afterclass block");
}
}
