 package ch08;

//생성자 함수 (메서드)
//객체 셍성시에 한번 호출되는 특수한 메서드
//객체 생성시에 1회 호출
//객체 생성시 필요한 초기값을 부여
//생성자 함수는 클래스 이름과 동일하며 반환자료형을 가지지 않는다.
//생성자 함수를 명시하지 않을떄 기본적으로 컴파일러에 의해 주입되는
//생성자가 있는대 이를 디퐁트 생성자 라고 한다.
//컴파일러에 의해 주입받는 디폴트 생성자는 모든 맴버의 초기값을 0(or false or null) 지정

class c08simple{
	int m1;
	double m2;
	boolean m3;
	String m4;
	//디폴트 생성자
	c08simple(){
		System.out.println("디폴트 생성자 호출");
		this.m1=10;
		this.m2=20.2;
		this.m3=true;
		this.m4="하입보이~";
		
	}
	c08simple(int ...x){
		System.out.println("c08simple(int ...x) 생성자 호출");
		for(int arg : x) {
			this.m1+=arg;
		}
	}
	
}

public class c08ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c08simple obj = new c08simple();
		System.out.printf("%d %f %b %s\n",obj.m1,obj.m2,obj.m3,obj.m4);
		c08simple obj2 = new c08simple(20);
		System.out.printf("%d %f %b %s\n",obj2.m1,obj2.m2,obj2.m3,obj2.m4);
		c08simple obj3 = new c08simple(20,100,20,30,40,50,60,70,80,100,101);
		System.out.printf("%d %f %b %s\n",obj3.m1,obj3.m2,obj3.m3,obj3.m4);
		
		
		
	}

}
