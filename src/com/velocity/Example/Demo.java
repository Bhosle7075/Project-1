package com.velocity.Example;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	
		Demo demo = new Demo();
		demo.m1();
	}
	
	public void m1() {
		List<String> list = new ArrayList<String>();
		list.add("Core-Java");
		list.add("Collection Framework");
		list.add("My-SQL");
		list.add("Git");
		list.add("JDBC");
		System.out.println(list);
	}

}
