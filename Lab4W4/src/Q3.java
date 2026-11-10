import java.util.Scanner; //import scanner
public class Q3 {

	public static void main(String[] args) {
		// initialization
		int age,vaccine;
		String status;
		
		//input
		Scanner input= new Scanner(System.in);
		
		//input
		System.out.print("Please input your age: ");
		age=input.nextInt();
		System.out.print("Please input 1 if YES TAKEN VACCINE and 2 if NO, DID NOT TAKE VACCINE. ");
		System.out.print("\nDid you take vaccine: ");
		vaccine=input.nextInt();
		
		//selection statements and output
		if(age>17) {
			if(vaccine==1) {
			   status = "Allow";
			   System.out.println("\nStatus: " + status);
			}else if(vaccine==2) {
				status="Don't Allow";
				System.out.println("\nStatus: " + status);
			}else {
				System.out.println("Invalid input! Please enter 1 or 2 only.");
			}
		}else {
			status="Terminated";
			System.out.println("\nStatus: " +status);
		}
		
		    
				input.close();
				


	}

}
