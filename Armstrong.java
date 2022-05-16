package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=135;
		int sum=0;
		int rem=0;
		int x=0;
		
		while(input>0)
		{
			rem= input%10;
			//if(rem==0)
			//	break;
			//else
			{x=rem*rem*rem;
			sum+= x;
			input=input/10;
			}
		}
		if(input==sum)
     System.out.println("Armstrong number of a given number is : "+sum);
		else
			System.out.println("Not an armstrong number");
	}

}
