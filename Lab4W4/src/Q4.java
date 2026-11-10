import java.util.Scanner; //import scanner
public class Q4 {

	public static void main(String[] args) {
		//initialization
		int code;
		double weight,basic;
		double total;
		
		//front cover
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("*              DELIVERY SERVICES                 *");
		System.out.println("*                                                *");
		System.out.println("**************************************************");
		
		//basic charge table
		System.out.println("*********************");
		System.out.println("*  CODE  * SERVICE  *");
		System.out.println("*   1    * Economy  *");
		System.out.println("*   2    * Standard *");
		System.out.println("*   3    * Express  *");
		System.out.println("*********************");
		
		
		System.out.println("Please input either code 1, 2 or 3 to select your service");
		//input
		Scanner input= new Scanner(System.in);
		
		System.out.print("Code: ");
		code=input.nextInt();
		
		System.out.println("Please input the weight of your delivery.");
		System.out.print("Weight(kg): ");
		weight= input.nextDouble();
		
		if (code == 1) {
			System.out.println("\nYou have chosen the Economy Service!");
			System.out.println("Your basic charge is RM5.00");
			basic = 5.00;
			   if (weight >5) {
				   System.out.println("\nYour delivery is overweight! Extra delivery charge will be added!");
				   System.out.println("Extra charge: RM 8.00");
				   total=basic+8.00;
			   }else {
				   System.out.println("Your delivery is within weight.");
				   total=basic;
				   }
		}
   	    else if(code==2) {
   	    	System.out.println("\nYou have chosen the Standard Service!");
			System.out.println("Your basic charge is RM10.00");
			basic = 10.00;
			   if (weight >5) {
				   System.out.println("\nYour delivery is overweight! Extra delivery charge will be added!");
				   System.out.println("Extra charge: RM 8.00");
				   total=basic+8.00;
			   }else {
				   System.out.println("Your delivery is within weight.");
				   total=basic;
				   }
		}	   
   	 else if(code==3) {
	    	System.out.println("\nYou have chosen the Express Service!");
			System.out.println("Your basic charge is RM20.00");
			basic = 20.00;
			   if (weight >5) {
				   System.out.println("\nYour delivery is overweight! Extra delivery charge will be added!");
				   System.out.println("Extra charge: RM 8.00");
				   total=basic+8.00;
			   }else {
				   System.out.println("Your delivery is within weight.");
				   total=basic;
				   }
		}
   	 else {
   		 System.out.println("\nInvalid Service Code");
		 total=0;}
	
		//output
		
		System.out.printf("\nYour total delivery charge is RM %.2f", total);
		input.close();
	}	   
	

	}
  
