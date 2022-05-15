package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number= 1;
       int i=0;
       int j =1;
       int fibb;
        for (number =1; number<=8; number++)
        {
          fibb= i+ j;
          System.out.println(i);
         // System.out.println(j);
          
          i=j;
          j=fibb;
        }
	}

}
