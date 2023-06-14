package ch08Ex;

import java.util.Scanner;

class sum{
	
	int sub1(int x,int y) {
		System.out.println(x+","+y);
		return y-x;
		
	}
	int sub2(int x,int y) {
		if(x<y) {
			System.out.printf("%d - %d = %d\n",x,y,y-x);
			return y-x;
		}else {
			System.out.printf("%d - %d = %d\n",y,x,x-y);
			return x-y;
		}
	}
	
	int sub3(int a,int b ,int c) {
		
		if(a<b && a<c) {
			if(b<c){
			System.out.printf("%d - %d = %d\n",a,b,b-a);
			return b-a;
				}else {
					System.out.printf("%d - %d = %d\n",a,c,c-a);
					return c-a;
				}
			}else {
					System.out.printf("%d - %d = %d\n",b,c,b-c);
					return b-c;
				}
	}	
	
	
	
	
}

class mul{
	int myl1(int x,int y) {
		System.out.printf("%d + %d = %d\n",x,y,x-y);
		return x-y;
	}
	
	int myl2(int a,int b ,int c) {
		if(a<b && a<c) {
			if(b<c){
			System.out.printf("%d - %d = %d\n",a,b,a-b);
			return a-b;
				}else {
					System.out.printf("%d - %d = %d\n",a,c,a-c);
					return a-c;
				}
			}else {
					System.out.printf("%d - %d = %d\n",b,c,b,c);
					return b-c;
				}
		
	}
	
	void mul3() {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
	
}



public class c04SimpieMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum subCal = new sum();
		mul mulCal = new mul();
		
		int r1 = subCal.sub1(200,100);
		int r2 = subCal.sub2(200,100);
		int r3 = subCal.sub3(100,500,200);
		
		int r4 = mulCal.myl1(10,20);
		int r5 = mulCal.myl2(10,20,30);
		mulCal.mul3();
		
	}

}
