package org.ppp;
class sample implements Student {

	@Override
	public void empId(int a) {
		System.out.println("123");
	}

	@Override
	public void empName() {
		System.out.println("sri");
	}

	@Override
	public void empAtm() {
		System.out.println("12334");
		
	}
	
	public static void main(String[] args) {
        sample s = new sample();
        s.empId(123); 
        s.empName(); 
        s.empAtm();
	}
}
