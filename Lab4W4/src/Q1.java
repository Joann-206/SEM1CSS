import java.util.Scanner; //import Scanner
public class Q1 {
//JOANN ANNYSSA GEORGE-BC260506
	public static void main(String[] args) {
		double CGPA;
		String status;//initialization
		
		//input
		Scanner input= new Scanner(System.in);
		
		//input
		System.out.print("Please input your CGPA: ");
		CGPA=input.nextDouble();
		
		//selection statements and output
		if(CGPA>=3.000) {
			status = "Good";
			System.out.println("Status: " + status);
		}else if( 2.500<=CGPA && CGPA <3.000) {
			status="Probation";
			System.out.println("Status: " + status);
		}else {
			status="Terminated";
			System.out.println("Status: " +status);
		}
		
		    
				input.close();
				

	}

}
