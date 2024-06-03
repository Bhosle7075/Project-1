package com.velocity.Example;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.m1();
		//demo.m2();
	}

	public void m1() {
		List<String> list = new ArrayList<String>();
		list.add("Core-Java");
		list.add("Collection Framework");
		list.add("Git");
		list.add("JDBC");
		list.add("HTML/CSS");
		list.add("Hibernate");
		list.add("Spring boot");
		list.add("Converter");
		for (String str : list) {
			System.out.println(str);
		}
	}

	public void m2() {
		List<String> list = new ArrayList<String>();
		list.add("Core-Java");
		list.add("Collection Framework");
		System.out.println(list);
	}

}
