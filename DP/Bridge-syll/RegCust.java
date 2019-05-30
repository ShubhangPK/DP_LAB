package Bridge;


public class RegCust extends DecathlonCustomer {

	public RegCust(String s, int a) {
		super(s,a); 
	}
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}
