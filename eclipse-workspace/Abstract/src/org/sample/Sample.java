package org.sample;
class Sample extends Company{
	@Override 
	public void emPAtm(String atmDetails) {
	System.out.println("ATM Details: " + atmDetails);
    }
	public static void main(String[] args) {

		        Sample sample = new Sample();
		        sample.empId(123); 
		        sample.empName(); 
		        sample.emPAtm("ATM is 123");

	}
	@Override
	public void emPAtm() {
		
	}

}
