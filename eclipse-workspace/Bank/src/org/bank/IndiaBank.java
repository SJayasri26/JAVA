package org.bank;

public class IndiaBank extends Bank{
	private void amtTwoForm() {
		System.out.println("From Amount: RBI");
	}
	public static void main(String[]args) {
		IndiaBank i=new IndiaBank();
		i.amtTwoForm();
		i.amtTo2();
	}
}
