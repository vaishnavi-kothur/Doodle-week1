package week1.day2;

public class Calculator {

	
	public double add(double num1, double num2, double num3)
	{
		double sum;
		sum=num1+num2+num3;
		return sum;
	}
	
	public double sub(double num1, double num2)
	{
		double diff;
		diff= num1-num2;
		return diff;
	}
	public double mul(double num1, double num2)
	{
		double prod;
		prod= num1*num2;
		return prod;
	}
	public float divide(float num1, float num2)
	{
		float div;
		div= num1/num2;
		return div;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalculator = new Calculator();
		System.out.println("Sum is : " +myCalculator.add(1, 2, 4));
		System.out.println("Diff is : "+myCalculator.sub(2, 3));
		System.out.println("Multiplication of number: " +myCalculator.mul(2.4, 3.5));
		System.out.println("Division of number : "  +myCalculator.divide(9, 3));

	}
}

