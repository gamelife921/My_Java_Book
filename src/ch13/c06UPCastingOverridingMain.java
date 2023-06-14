package ch13;

class c06Super{
	void SuperFunc() {System.out.println("SuperFunc 호출!!");}
}
class c06Sub extends c06Super{
	void SubFunc() {System.out.println("SuperFunc 호출!!");}
	
	void SuperFunc() {System.out.println("Sub 클래스에서 재정의한 SuperFunc 호출!!");}
}


public class c06UPCastingOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c06Super ob = new c06Super();//Upcasting
		ob.SuperFunc(); // 물려받은 맴버는 접근 가능
		//ob.SubFunc(); // 확장된 맴버는 접근 불가
		
		//Upcasting 을 사용하면
		// 확장된 맴버에 접근가능? x > Downcasting 을 통해 확장된 맴버에 접근
		//오버라이딩된 멤버에 접근가능? 
	}

}
