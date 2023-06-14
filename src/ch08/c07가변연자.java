package ch08;

class c07Simple{
	int sum(int ...arg) {
		int sum =0;
		for(int n : arg) {
			System.out.println("인자 값: "+n);
		}
		return 0;
	}
	
	
}

public class c07가변연자 {

	public static void main(String[] args) {
		
		c07Simple obj = new c07Simple();
		obj.sum(10);System.out.println();
		obj.sum(10,20);System.out.println();
		obj.sum(10,20,30);System.out.println();
		obj.sum(10,20,30,40);System.out.println();
		int r=obj.sum(10,20,30,40,50,60,70,80);System.out.println();
		System.out.println("합 : "+r);
		}

}
