package org.set;

import java.util.ArrayList;
import java.util.List;

public class gene {
	public static void main(String[] args) {
		List<Integer> e=new ArrayList();
		e.add(10);
		e.add(20);
		e.add(30);
		e.add(40);
		
		List<Integer> d=new ArrayList();
		d.add(10);
		d.add(20);
		
		
		e.removeAll(d);
		d.removeAll(e);
		System.out.println(d);
		System.out.println(e);
		
		d.retainAll(e);
		System.out.println(d);
		
		
		List<Integer> c=new ArrayList();
		c.addAll(e);
		System.out.println(c);
		
		c.clear();
		System.out.println(c);
	}
}
