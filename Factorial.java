package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input =5;
       int i;
       int fact =1;
       for(i=1; i<=input; i++)
       {
    	   fact=fact*i; 
       }
       
       System.out.println("Factorial of a given number is : " + fact);
	}

}
