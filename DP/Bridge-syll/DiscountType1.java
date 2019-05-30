package Bridge;

 


public class DiscountType1 implements iDiscountCalculator {

	public void calculateBillAmount(double mrptotal) {
		double billamount; double discount; 
		
		discount = 0.22; 
			
			billamount = mrptotal - discount * mrptotal;
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
	
}
