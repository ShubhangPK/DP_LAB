package Bridge;

public class BridgeClientMain {

	public static void main(String[] args) {
		
    double mrptotal = 8000.50; 
		
        RegCust oRC = new RegCust(" X ", 24); 
		SeniorCitizenCust oSCC = new SeniorCitizenCust(" Y ",62); 
		
		
		DiscountType1 odtype1 = new DiscountType1(); 
		oRC.display(); 		
		DiscountType2 odtype2 = new DiscountType2(); 
		oRC.setDiscountType(odtype2); 
		
		oRC.calculateDiscount(mrptotal);	
		
		
		oSCC.display(); 
		oSCC.setDiscountType(odtype1); 
		oSCC.calculateDiscount(mrptotal);
		 
	}

}
