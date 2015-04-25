import java.text.NumberFormat; //Formats currency 

public class PayCalculatorTest {
	public static void main(String[] args) throws InterruptedException{
		
		double payRate=100;
		double hour=10;

		PayCalculator regularPay = new RegularPay(payRate);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();// format currency
		
		System.out.println("Your pay rate is: \t" + formatter.format(payRate) + "/hr");
		Thread.sleep(500);
		System.out.println("Your regular pay is: \t" + formatter.format(regularPay.computePay(hour))); //computes regular pay
		Thread.sleep(500);
		PayCalculator hazardPay = new HazardPay(payRate);
		System.out.println("Your hazard pay is: \t" + formatter.format(hazardPay.computePay(hour))); //computes hazard pay
	}
}