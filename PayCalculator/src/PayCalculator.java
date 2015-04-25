/**
Requirements:
Create an abstract class PayCalculator that has an attribute payRate given in dollars per hour. 
The class should also have a method computePay(hours) that returns the pay for a given amount of time.
Derive a class RegularPay from PayCalculator, as described above. 
It should have a constructor that has a parameter for the pay rate. 
Then derive a class HazardPay from PayCalculator that overrides the computePay method. 
The new method should return the amount returned by the base class method multiplied by 1.5.
 */
public abstract class PayCalculator {
	
	double payRate;
	
	public PayCalculator(double payRate){
		this.payRate=payRate;
	}
	
	public abstract double computePay(double hour);
}