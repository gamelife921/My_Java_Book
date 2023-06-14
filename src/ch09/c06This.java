package ch09;

//this
//클래스 내에서 사용되는 예약어
//생성되는 개체의 위치 정보(메모리 주소)를 가져오는데 사용

//this 활용
//1) 멤버변수와 매개변수를 구별
// - this.x=x;
//2) 같은 클래스의 다른 생성자 호출

class c06Simple{
	int x;
	int y;
	
	c06Simple(){
		this(123,123);
		System.out.println("c06Simple() 호출");
		//this.x=123;this.y=123;
		
	}
	c06Simple(int x ){
		//this.x=x;
		//this.y=0;
		this(x,0);
		System.out.println("c06Simple(int x) 호출");
	}
	c06Simple(int x,int y){
		this.x=x;this.y=y;
		System.out.println("c06Simple(int x, int y) 호출");
	}
}

class A{
	
	A getThis() {
		return this;
	}
}


public class c06This {
	public static void main(String[] args) {
		
//		A ob = new A();
//		System.out.println("ob : "+ob);
//		System.out.println("ob.getThis() : "+ob.getThis());
		
//		
		c06Simple ob1= new c06Simple();
//		c06Simple ob2= new c06Simple(100);
//		c06Simple ob3= new c06Simple(100,200);
//		
//		
	}

}
