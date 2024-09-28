package org.pali;
import java.util.*;
public class Company {
	public static void main(String[] args) {
	
		String s="JAYASRI"
				+ "";
		String a="";
		for(int i=s.length() -1; i>=0;i--) {
			a=a+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(a);
		
		if(s.equals(a)) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
