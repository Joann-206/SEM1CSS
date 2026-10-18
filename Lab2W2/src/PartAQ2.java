
public class PartAQ2 {

	public static void main(String[] args) {
		double oriprice, finalprice; //declaration
		double discount;
		
		//initialization
		oriprice = 50;
		discount = 0.5;
		
		//calculate discount
		finalprice= oriprice-(oriprice * discount);
		
		//output
		System.out.println("The final price after discount is RM" + finalprice);

	}

}
