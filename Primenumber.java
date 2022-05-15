package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int input=9;
 int i, j;
 boolean flag =true;
  for (i=2; i<=input/2; i++)
  {
	  int rem= input%i;
	  
	   if (rem==1) 
		   if (input==2)
			   System.out.println("It is a prime number");
	   if(rem==0)
	   {   
		   flag=false;
		   System.out.println("Given input is not a prime number");
	     break;
	  // exit;
	   }
  }
  if(flag==true)
  System.out.println("Given number is a prime number");
	}

}
