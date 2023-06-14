package ch08;

import java.util.Scanner;

//속성
class c03Preson {
	String name;
	int age;
	float height; // 신장
	double weight; // 몸무게
	//기능(멤버함수,멤버메서드)
	//말하다
	void talk() {
		System.out.println(name+"님이 말하니다");
	}
	//걷다
	void walk() {
		System.out.println(name+"님이 걷습니다.");
	}
	//속성정보확인
	void showInfo() {
		System.out.printf("%s %d %f %f\n",name,age,height,weight);
	}
}
public class c03PresonMain2 {
	


	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		c03Preson hong = new c03Preson();
		hong.name=sc.next;
		hong.age = sc.nextInt;
		hong.height=sc.nextFloat();
		hong.weight=70.4;
		System.out.printf("%s %d %f %f\n", hong.name,hong.age,hong.height,hong.weight);
		hong.talk();
		hong.walk();
		hong.showInfo();
		

	}
	

}
