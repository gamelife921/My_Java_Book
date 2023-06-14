package ch15;

//extends 예약어로는 상속 관계1
//implements 예약어로 다중상속이 가능하다
//extends 먼저 implements 나중에

interface A{}

interface B{}

class C implements A{}

class E extends C implements A,B{}



public class c03InerfacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
