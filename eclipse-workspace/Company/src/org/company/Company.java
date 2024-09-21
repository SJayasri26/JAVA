package org.company;

public class Company {
		private void companyDetails() { //Method name
		System.out.println("Zoho"); //Print statement
		}
		private void companyId() {
		System.out.println("23");
	}

		private void companyAddress() {
		System.out.println("chennai");
		
		}
	public static void main(String[]args) {   //Main method
		Company s= new Company();  //Object Create
		s.companyDetails();   //Method call
		s.companyId();
		s.companyAddress();
	}
		



	}

