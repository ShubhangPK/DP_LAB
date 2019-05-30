package pkgTemplateMethod;



public class OnlineOrderProcessing extends OrderProcessing{ 
	String answer; 
	int qty; 
	
	OnlineOrderProcessing() { 
		oItemsList = new ItemsList(); 
		System.out.println("Do you want to add more items to this list?"); 
		answer = scan.next();
		if(answer.equals("YES") || answer.equals("yes")  || answer.equals("Yes") || answer.equals("y")  || answer.equals( "Y")) 
			oItemsList.addItems();
		  
		
	}
	
	protected void selectItem(){
		System.out.println("The Items available Online for purchase in Decathlon Store are: "); 
		oItemsList.getItemDetails();
				
	}
	
	protected void doPayment(String item){
		System.out.println("How many pieces of "+answer+" do you want to buy?"); 
		qty = scan.nextInt(); 
		System.out.println("You need to pay Rs."+oItemsList.calculatePrice(qty,item)); 
		System.out.println("Online Customer****Please Pay through net banking"); 
	}
	
	protected void doDelivery(){
		System.out.println("If you enter your address for delivery, it will be couriered to that address!"); 
	}
	
}

