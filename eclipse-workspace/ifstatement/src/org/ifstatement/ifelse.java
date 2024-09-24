package org.ifstatement;

public class ifelse {
	private void vector(int age) {
		if(age>=18) {
		System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}

	}
	public static void main(String[]args) {
		ifelse e=new ifelse();
		 e.vector(10);
		
	}
}
