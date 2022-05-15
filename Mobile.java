package week1.day1;

public class Mobile {
	public void makeCall () {
		System.out.println("Make a call");
	}
    public void sendMsg() {
    	System.out.print("Send a message");
    }
   public static void main(String[] args) {
	   Mobile myMobile = new Mobile();
	   myMobile.makeCall();
	   myMobile.sendMsg();
   }
}
