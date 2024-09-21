package org.college;

public class Student {
	private void stuName(){
		System.out.println("Jayasri");
		
	}
	private void sin() {
		System.out.println("23");
		
	}
	private void Dept() {
		System.out.println("IT");
		
	}
	public static void main(String[]args) {
		College I = new College();
		I.clgName();
		I.clgType();
		Student S = new Student();
		S.stuName();
		S.sin();
		S.Dept();
	}
}
