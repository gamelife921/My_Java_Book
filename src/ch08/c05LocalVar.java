package ch08;

class c05simple{
	int num;
	void Func1() {
		num=5;
		System.out.println("변수 num:" + num);
		int num=10; //Func1의 지역변수
		System.out.println("변수 num:" + num);
		num++;		//Func1의 지역변수 num의 값 1증가
		System.out.println("변수 num:" + num);
		this.num++;	//맴버변수 num의 값 1증가
		System.out.println("변수 num:" + this.num);
		//Func1의 지역변수  num은 공간 소멸..
	}
	void Func2() {
		System.out.println("변수 num:" + num);
		if(true) {
			int num=20;
			this.num++;
			System.out.println("변수 num:" + num);
		}
		System.out.println("변수 num:" + num);
	}
	void Func3() {
		System.out.println("변수 num:" + num);
		while(num>0) {
			int num=100;
			System.out.println("변수 num:" + num);
			num++;
			break;
		}
		System.out.println("변수 num:" + num);
	}
}

public class c05LocalVar {

	public static void main(String[] args) {
		
		c05simple obj=new c05simple();
		obj.Func1();
		System.out.println();
		obj.Func2();
		System.out.println();
		obj.Func3();

		
	}

}
