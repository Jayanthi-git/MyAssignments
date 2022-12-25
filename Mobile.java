package week1.day1Assignment;

public class Mobile {
public void sendMsg() {
	System.out.println("This is my mobile");
	
	boolean isFullyCharged= false;
	System.out.println(isFullyCharged);
	int mobileCost = 45000;
	System.out.println(mobileCost); 
	System.out.println("Hi I am sending Message");
}
public void makeCall() {
	String mobileModel ="Samsung";
	float mobileWeight =2.8f;
	System.out.println("I am making call");
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile sm= new Mobile();
sm.sendMsg();
Mobile mc=new Mobile();
mc.makeCall();
	}

}
