import java.util.Scanner; //import scanner
public class Q2 {
//JOANN ANNYSSA GEORGE-BC260506
	public static void main(String[] args) {
		//initialization
		double totalprice, discount,finalprice;
		

		//input
		Scanner input= new Scanner(System.in);
		
		//input
		System.out.print("Please input your total price(RM): ");
		totalprice=input.nextDouble();
		
		//selection statements and output
		if(totalprice>50) {
			discount = 0.20;
			System.out.println("Congratulations! You get 20% discount.");
		}else {
			discount=0;
			System.out.println("Apologies. You did not receive any discount");
		}
		
		//calculations
		finalprice= totalprice - (totalprice*discount);
		
		//output
		System.out.printf(" \nYour final price is: %.2f", finalprice);
				input.close();
				


	}

}
