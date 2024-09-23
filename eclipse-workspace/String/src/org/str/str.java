package org.str;

public class str {
	public static void main(String[]args) {
		String s=" Sri";
		//length
		int length=s.length();
		System.out.println(length);
		//charAt
		char charAt=s.charAt(1);
		System.out.println(charAt);
		//indexOf
		int indexOf=s.indexOf("i");
		System.out.println(indexOf);
		//isEmpty
		boolean empty=s.isEmpty();
		System.out.println(empty);
		//contains
		boolean contains=s.contains("ya");
		System.out.println(contains);
		//trim
		String trim=s.trim();
		System.out.println(trim);
		//stratsWith
		boolean stratWith=s.startsWith("S");
		System.out.println(stratWith);
		//endswith
		boolean endswith=s.endsWith("ri");
		System.out.println(endswith);
		//toUppercase //toLowercase
		String uppercase=s.toUpperCase();
		System.out.println(uppercase);
		String lowercase=s.toLowerCase();
		System.out.println(lowercase);
		
		//equals 
		String a="sri";
		String b="SRI";
		boolean equals=a.equals(b);
		System.out.println(equals);
		//equals ignore
		boolean equalsingnorcase =s.equalsIgnoreCase(b);
		System.out.println(equalsingnorcase);
		//replace
		String replace=b.replace("SRI","DEVA");
		System.out.println(replace);
		//replace all
		String c= a.replaceAll(a,b);
		System.out.println(c);
		String d="python";
		//Substring
		String substring=d.substring(1);
		System.out.println(substring);
		
		String subs=d.substring(1,4);
		System.out.println(subs);
		
		int compare=a.compareTo(b);
		System.out.println(compare);
		
		
		
	}
}
