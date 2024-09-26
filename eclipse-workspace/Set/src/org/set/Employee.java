package org.set;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	public static void main(String[] args) {
		Set<Object> s= new HashSet<Object>();
		s.add("hii");
		s.add(29);
		s.add(2.4);
		s.add(true);
		s.add('A');
		System.out.println(s);
		System.out.println("=========================");
		 for (Object item : s) {
	            System.out.println(item);
	        }
	}
}
