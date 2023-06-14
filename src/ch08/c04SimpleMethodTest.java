package ch08;

import java.util.Scanner;

class sum{
	
	Scanner sc= new Scanner(System.in);
	
	//인자 o 반환 o 
	int sum1(int x , int y) {
		System.out.println("sum(x,y) 호출!");
		return x+y;
	}
	
	// 인자 x 반환 o
	int sum2() {
		System.out.println("int sum1() 호출");
		int x= sc.nextInt();
		int y= sc.nextInt();
		return x+y;
	}
	//이자 o 반환 x
	void sum3(int x, int y) {
		System.out.println("void sum3(int x,int y) 호출!*");
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
	void sum4() {
		System.out.println("void sum4() 호출!*");
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
}


public class c04SimpleMethodTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum calc = new sum();
		
		int reylt1 = calc.sum1(10,20);
		System.out.println("result1:"+reylt1);
		
		int result2 = calc.sum2();
		System.out.println("result2 :"+ result2);
		
		calc.sum3(200,300);
		calc.sum4();
		
	}

}
