package Bridge;


abstract public class DecathlonCustomer {
	
	 String name; 
	 int age;
	
	iDiscountCalculator iCC; 
	public DecathlonCustomer (String s, int a) { name = s; age = a; } 
	DecathlonCustomer(){}
	
	public void setDiscountType (iDiscountCalculator refCC) { 
		iCC = refCC; 
	}
	
	public void calculateDiscount(double mrptotal) { 
		iCC.calculateBillAmount(mrptotal); 
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}
