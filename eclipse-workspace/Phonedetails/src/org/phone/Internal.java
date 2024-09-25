package org.phone;

public class Internal {
	private void processorName() {
		System.out.println("Processor Name:INTEL");
		
	}
	private void ramSize() {
		System.out.println("Ram size:8GB");
		
	}
	 public static void main(String[]args) {
		 External e = new External();
		 e.size();
		 
		 Internal i = new Internal();
		 i.processorName();
		 i.ramSize();
		 
	 }

}
