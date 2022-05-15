package week1.day1;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car myCar = new Car();
		
      myCar.applyBreak();
      myCar.applyGear();
      myCar.applyAccelerate();
      myCar.switchonAc();
      
	}  
		public void applyBreak()
		{
			System.out.println("Applying the break");
		}
		
		public void applyGear()
		{
			System.out.println("Applying the gear");
		}
		
		public void switchonAc()
		{
			System.out.println("Switching on the AC");
		}
		public void applyAccelerate()
		{
			System.out.println("Applying the accelerator");	
		}
		


}
