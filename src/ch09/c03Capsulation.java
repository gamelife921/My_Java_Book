package ch09;

class 라면Recip{
	//순서
	private void step1() {System.out.println("step1");};
	private void step2() {System.out.println("step2");};
	private void step3() {System.out.println("step3");};
	private void step4() {System.out.println("step4");};
	
	public void cooking() {
		step1();
		step2();
		step3();
		step4();
	}
}

class cook{
	public 라면Recip Recip_ramen =new 라면Recip();
	

}


public class c03Capsulation {

	public static void main(String[] args) {
		cook hong = new cook();
		hong.Recip_ramen.cooking();
		
	
	}

}
