package org.method;

public class Student1 extends Student {
	@Override
	public void studentName(String name) {
		System.out.println("New student name is:"+name);
		super.studentName("Jaya");
	}
	public static void main(String[]args) {
		Student1 n = new Student1();
		n.studentName("Deva");
		
}
}