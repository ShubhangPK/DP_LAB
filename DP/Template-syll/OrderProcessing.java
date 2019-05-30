package pkgTemplateMethod;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class OrderProcessing {
	Scanner scan = new Scanner(System.in) ; 
	ItemsList oItemsList; 
	
	public final void processOrder() { 
		
		selectItem(); 
		System.out.println("Which Item do you want to buy?"); 
		String item = scan.next(); 
		boolean exists; 
		exists = oItemsList.searchItem(item); 
		
		if(exists){
			doPayment(item); doDelivery(); 
	}
		else
			System.out.println("Sorry! We do not have the item "+item+" which you are looking for!"); 		
		
	}
	protected abstract void selectItem(); 
	protected abstract void doPayment(String item);
	protected abstract void doDelivery();
}
