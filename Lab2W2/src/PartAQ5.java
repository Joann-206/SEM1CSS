import java.util.Scanner; //import scanner

public class PartAQ5 {

	public static void main(String[] args) {
		//declaration
		double price, discount, purchaseprice,finalprice ;
		int quantity;
		
		//input
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter price of product: ");
		price = input.nextDouble();
		
		System.out.println("Enter quantity of product: ");
		quantity = input.nextInt();
		
		//calculations
		purchaseprice = price * quantity; 
        discount = purchaseprice * 0.11;
        finalprice= purchaseprice - discount;
        
        //output
        System.out.println("Total purchase price: " + purchaseprice);
        System.out.println("Total discount: " + discount);
        System.out.println("Total purchase price after discount: " +finalprice );
		

		
	}

}
