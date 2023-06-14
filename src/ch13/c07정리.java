package ch13;

class Calculator{ // 계산기
	int sum(int x,int y){return x+y;}
	int sum(int x,int y,int z){return x+y+z;}
}
class ScientificCalculator extends Calculator{ //공학용계산기
	int sum(int x,int y){return x+y+100;}
	int sum(int x,int y,int z){return x+y+z+100;}

	int sum(int x,int y,int z,String a) {System.out.println("");}
}


public class c07정리 {
	
	public static void main(String[] args) {
		//상속?
		//물려주는거
		//상위클래스의 속성/기능을 하위클래스가 받아서 사용할 수 있도록 허용한 문법
		//상위(부모,수퍼)클래스: 물려주는 클래스
		//하위(자식,서브)클래스: 물려받는 클래스
		//하위클래스 extends예약어 사용 상위클래스 지정
		
		//오버라이딩(재정의)
		//상속관계를 전제로 하여 상위클래스의 메서드를 하위클래스가 받아 고쳐사용하는 것을 이용한 문법
		//메서드의 헤더 고정 / 바디 변경
		
		//오버라이딩 vs 오버라이딩
		//오버로딩 : 상속관계 x , 반환자료형 한ㅁ수명 고정 / 매개변수가 다양하게 허용
		//오버라이딩 : 상속관계 o , 함수 해더 (반환자료형 , 함수명,매개변수)고정/ 본체부분 변경
		
		//Casting
		//클래수형변환
		
		//-NoCasting
		// 해당 클래스 자료형 ref=new 해당클래스 생성자()
		//-Upcasting
		// 상위 클래스자료형 ref=new 하위클래스 생성자()
		//자동형변화
		//상속관꼐의 모든 하위 객체를 바인딩을 하려는 것이 목적
		//오버라이딩된 하위 객체의 메서드를 사용하려는 것이 목적
		//확정된 하위 맴버에 접근 가능? x
		//오버라이딩된(재정의 된) 하위 맴버 접근 가능?o
		
		//-Downcasting
		//하위클래스형 ref=상위 객체
		//upcasting을 전체로 했을 확장된 맴버에 접근 블가능 하기 때문에
		// 해당 자료형으로 형을 강제로 일치 시켜서 확장된 맴버에 접근 가능
		//강제 형변환
		//-IntanceOf
		//클래스형을 선별하기위해 사용되는 예약어
		
		
		//Upcasting + Overriding,extends
		
		
		
		
	}

}
