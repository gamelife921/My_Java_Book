package ch14;

class par1 {
	void Func() {} // 완성형
}

class son1 extends par1 {
	void Func() {System.out.println("Son1에서 재정의한 Func() 호출!");}
}

abstract class par2 {
	abstract void Func();//추상메서드 (미완성된 메서드)
}
	class son2 extends par2 {

		@Override
		void Func() {
			System.out.println("Son2에서 강제로 재정의한 Func()호출 !");
			
		}
		
}

public class c01AbstractMain {

	public static void main(String[] args) {
		par1 ob1 = new par1(); 	//상위클래스 객체 생성 o
		son1 ob2  = new son1(); // 하위클래스 객체 생성 o
		par1 ob3 = ob2; 		//Uocasting
		ob3.Func();				//상위 참조변수로 재정의 한 하위객체 메서드 접근 o
		
		//par2 ob4 = new par2();//추상클래스 객체 생성x
		son2 ob5 = new son2(); 	// 추장메서드를 재정의 해야가능
		par2 ob6 = ob5;			//Upcasting
		ob6.Func();				//
		
		
	}

}
