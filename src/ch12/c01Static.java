package ch12;

//자바의 메모리 구조

//스택영역				:{}내에서 선인되는 변수,{}벗어나면 소멸
//클래스(메서드)영역		:공유메모리 영역, static변수,static 함수, 맴버함수,생성자함수
//힙영역				: new 예약어 사용시 메모리 공간 할당, 참조변수 연결해제시 GC에 의해 제거


class c01Simple{
	static int num1=0; 	//c01Simple 개체간의 공유되는 변수
						//객체 생성과는 무관하게 메모리공간에 할당
						// 클래스명으로 접근가능
	
//	int num1=0;
	int num2=0;
	@Override
	public String toString() {
		return "c01Simple [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	//toString 재정의
	
}

public class c01Static {

	public static void main(String[] args) {
		c01Simple.num1=1234;
		System.out.println("static num1 : "+c01Simple.num1);
		
		
		c01Simple ob1 =new c01Simple();
		c01Simple ob2 =new c01Simple();
		ob1.num1=100;ob1.num2=200;
		ob2.num1=300;ob2.num2=400;
		
		
		System.out.println(ob1);	
		System.out.println(ob2);	
		
	}

}
