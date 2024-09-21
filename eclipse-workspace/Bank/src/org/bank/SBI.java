package org.bank;

public class SBI extends Bank{	
	private void amtFrom() {
		System.out.println("amount come from:RBI");
	}
	public static void main(String[]args) {
		SBI s=new SBI();
		s.amtFrom();
		s.amtTo();
	}
}
