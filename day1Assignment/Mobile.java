package week1.day1Assignment;

public class Mobile {
public void sendMsg() {
	System.out.println("This is my mobile");
	System.out.println("Hi I am sending Message");
}
public void makeCall() {
	System.out.println("I am making call");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile sm= new Mobile();
sm.sendMsg();
Mobile mc=new Mobile();
mc.makeCall();
	}

}
