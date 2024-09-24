package org.collections;
import java.util.ArrayList;
import java.util.List;

public class company {
	  public static void main(String[] args) {
		List li =new ArrayList();
		li.add(10);
		li.add(true);
		li.add(2.3);
		li.add(11);
		li.add(19);
		System.out.println(li);
		
		int size=li.size();
		System.out.println(size);
		
		li.remove(2);
		System.out.println(li);
		
		int index=li.indexOf(11);
		System.out.println(index);
		
		int last=li.lastIndexOf(5);
		System.out.println(last);
		
		boolean contain=li.contains(0);
		System.out.println(contain);
		System.out.println("====================");
		
        Object object=li.get(0);
        System.out.println(object);
        
        Object ob=li.get();
        System.out.println(ob);
	} 
}
