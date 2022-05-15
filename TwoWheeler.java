package week1.day1;

public class TwoWheeler {

     public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		TwoWheeler bike= new TwoWheeler();
 		bike.myBikeDetails();
     }
 	public void myBikeDetails() {
 		int noOfWheels = 2;
 	     short noOfMirrors = 2; 
 	     long chassisNumber =1233444666444777888l;
 	     boolean isPunctured = false;
 	     String bikeName= new String("Pulsar");
 	     double runningKM= 56789.97;
 	     
 	     System.out.println("No of wheels in TwoWheeler is : " + noOfWheels);
 	     System.out.println("No of mirrors in Twowheeler is : " + noOfMirrors);
 	     System.out.println("Bike Chassis Number is : " + chassisNumber);
 	    System.out.println("Is bike Punctured...? " + isPunctured);
 	    System.out.println("Bike Name: " + bikeName);
 	   System.out.println("Bike total running KM : " + runningKM);
 	}
	}

