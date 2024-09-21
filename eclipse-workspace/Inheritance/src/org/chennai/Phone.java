package org.chennai;

public class Phone extends Product {
	private void PhoneRate() {
		System.out.println("Phone Rate : 22000");
		
	}
	public static void main (String[]args) {
		Phone r = new Phone();
		r.PhoneName();
		r.MadeAt();
		r.ProductName();
		r.PhoneRate();
	}
}
