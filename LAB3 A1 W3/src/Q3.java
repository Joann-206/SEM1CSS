import java.util.Scanner; //import scanner
public class Q3 {

	
	public static void main(String[] args) {
		//initialization
		double consumption,rate,servicecharge, taxrate;
		double charge,subtotal,tax,total;
		String state;
		
		//front cover
		System.out.println(">>>======================================================<<<");
		System.out.println("V                                                          V");
		System.out.println("V               POWERGRID MALAYSIA PORTAL                  V");
		System.out.println("V                                                          V");
		System.out.println(">>>======================================================<<<");
		
		// to access specific state portal
		System.out.println("STATUS: ONLINE");
		System.out.println(" ");
		System.out.println("Greetings User. Please enter the state to access the state's portal.");

		//input
		Scanner input= new Scanner(System.in);
		
		System.out.print("State: ");
		state=input.nextLine();
		System.out.println(" ");
		
		//access state portal
		System.out.println(">>>===============================================================<<<");
		System.out.println(" WELCOME TO "+ state+ " PORTAL");
			
		
		System.out.println("Please input all the below requirements accordingly.");
		System.out.println(" ");
		//input
		System.out.print("Electricity consumption(kwH):  ");
		consumption=input.nextDouble();
		System.out.print("Electricity rate per kwH(RM):  ");
		rate=input.nextDouble();
		System.out.print("Monthly Service Charge(RM):  ");
		servicecharge=input.nextDouble();
		

		System.out.println(" ");
		System.out.println("Please take note the tax rate is fixed at 6%.");
		taxrate=6;
		
		//calculations
		
		charge= consumption * rate;
		subtotal=charge + servicecharge;
		tax = subtotal * (taxrate/100);
		total= subtotal+tax;
		
		//output
		System.out.println(">>>===============================================================<<<");
		System.out.println(" Below is your invoice.");
		System.out.println(" ");
		System.out.printf("Energy charge(RM): %.2f\n", charge);
		System.out.printf("Total tax(RM): %.2f\n", tax);
		System.out.printf("Subtotal(RM): %.2f\n", subtotal);
		System.out.printf("Total electricity bill(RM): %.2f\n", total);
		
		//ending message

		System.out.println(" ");
		System.out.println("Thank you for using our portal.");
		System.out.println("STATUS: OFFLINE");
	
		input.close();
				


	}

}
