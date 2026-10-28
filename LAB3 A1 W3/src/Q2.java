import java.util.Scanner; //import scanner
public class Q2 {

	public static void main(String[] args) {
		//initialization
		double basicsalary,housing,transport,overtimehour, overtimerate, retirement, others;
		double overtime,grosssalary, netsalary, annual, retirementtotal, totaldeduct;
		String name,userID;
		//front cover
				System.out.println("************************************************************");
				System.out.println("*                                                          *");
				System.out.println("*                 FLOWCO SALARY SYSTEM                     *");
				System.out.println("*                                                          *");
				System.out.println("************************************************************");
				
				System.out.println("To login, please input your name and user ID.");
				System.out.println(" ");
				
				//input
				Scanner input= new Scanner(System.in);
				
				System.out.print("Name:  ");
				name=input.nextLine();
				System.out.print("ID:  ");
				userID=input.nextLine();
				
				System.out.println(" ");
				
				//login system
				System.out.println("Welcome "+ name + "!");
				System.out.println("Please input the below requirements accordingly.");
				
				//input
				System.out.print("Basic Salary(RM):  ");
				basicsalary=input.nextDouble();
				System.out.print("Housing allowance(RM):  ");
				housing=input.nextDouble();
				System.out.print("Transportation Allowance(RM):  ");
				transport=input.nextDouble();
				System.out.print("Other deductions(RM):  ");
				others=input.nextDouble();
				
				System.out.println(" ");
				System.out.println("Please take note that retirement contribution is fixed at 10%.");
				retirement=0.10;
				
				System.out.println(" ");
				System.out.println("Please only fill up if you are eligible for overtime. Otherwise, input 0 as overtime hours and rate.");
				System.out.print("Overtime hours:  ");
				overtimehour=input.nextDouble();
				System.out.print("Overtime rate(RM/hour):  ");
				overtimerate=input.nextDouble();
				System.out.println(" ");
				
				//calculations
				overtime= overtimehour * overtimerate;
				grosssalary= basicsalary + housing + transport + overtime;
				retirementtotal = retirement * grosssalary;
				totaldeduct = retirementtotal + others;
				netsalary= grosssalary - totaldeduct;
				annual= netsalary * 12;
				
				//output
				System.out.println("************************************************************");
				
				System.out.println("Below is your salary summary, " + name);
				System.out.println(" ");
				
				System.out.printf("Gross salary(RM): %.2f\n" , grosssalary);
				System.out.printf("Overtime pay(RM): %.2f\n", overtime);
				System.out.printf("Total retirement contribution(RM): %.2f\n", retirementtotal);
				System.out.printf("Total deductions(RM): %.2f\n", totaldeduct);
				System.out.printf("Net Salary(RM): %.2f\n", netsalary);
				System.out.printf("Annual net salary(RM): %.2f\n", annual);
				
				//ending message
				System.out.println(" ");
				System.out.println("Thank you for using our system. Don't forget to log out!");
	
				input.close();
	}

}
