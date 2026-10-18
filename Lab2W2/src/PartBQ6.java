import java.util.Scanner; //import scanner

public class PartBQ6 {

	public static void main(String[] args) {
		int asess1, asess2, lab, finalexam ;
		//input
		Scanner input =new Scanner(System.in);
		
		System.out.println("The course evaluation: (input must be percentage)");
		System.out.println("Assessment 1: ");
		asess1 = input.nextInt();
		
		System.out.println("Assessment 2: ");
		asess2 = input.nextInt();
		
		System.out.println("Lab Assignment: ");
		lab = input.nextInt();
		
		System.out.println("Final Exam: ");
		finalexam = input.nextInt();
		

	}

}
