import java.util.Scanner; //import scanner
public class Q1 {

	
	public static void main(String[] args) {
		//initialization
		double price, quantity,discount,delivery,packaging,tax;
		double subtotal,totaldiscount, netprice, totaltax, finalpayment;
		
		//front cover
		System.out.println("************************************************************");
		System.out.println("*                                                          *");
		System.out.println("*       WELCOME TO JOANN ONLINE CLOTHING STORE             *");
		System.out.println("*                                                          *");
		System.out.println("************************************************************");
		
		System.out.println("Please input all the below requirements accordingly.");
		System.out.println(" ");
		
		//input
		Scanner input= new Scanner(System.in);
		
		System.out.print("Price per item(RM):  ");
		price=input.nextDouble();
		System.out.print("Quantity of items:  ");
		quantity=input.nextDouble();
		System.out.print("Delivery fee(RM):  ");
		delivery=input.nextDouble();
		System.out.print("Packaging fee(RM):  ");
		packaging=input.nextDouble();
		
		System.out.println(" ");
		System.out.println("Please take note that the following requirements must be given in percentage form");
		
		
		System.out.print("Discount(%):  ");
		discount=input.nextDouble();
		System.out.print("Tax rate(%):  ");
		tax=input.nextDouble();
		
		System.out.println("************************************************************");
		
		System.out.println(" ");
		
		//calculations
		subtotal = price*quantity;
		totaldiscount= (discount/100) * subtotal;
		netprice = subtotal - totaldiscount;
		totaltax= (tax/100) * netprice;
		finalpayment= netprice + totaltax + delivery + packaging;
		
		//output
		System.out.println("Below is your final receipt.");
		System.out.println(" ");
				
		System.out.printf("Merchandise subtotal(RM): %.2f\n", subtotal);
		System.out.printf("Total discount(RM): %.2f\n" ,totaldiscount );
		System.out.printf("Net merchandise price(RM): %.2f\n" ,netprice);
		System.out.printf("Delivery fee(RM): %.2f\n" ,delivery);
		System.out.printf("Packaging fee(RM : %.2f\n" ,packaging);
		System.out.printf("Final payment(RM) :%.2f\n" ,finalpayment);
		
		//ending message

		System.out.println(" ");
		System.out.println("Thank you for shopping with us!");
		
		input.close();
		

	}

}
