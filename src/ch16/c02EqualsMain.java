package ch16;

class c02Simple{
	int n;
	c02Simple(int n){
		this.n=n;
	}
	// 두 객체간의 n의 값이 일치하면 동등객체 equals 재정의 예정
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof c02Simple) {
			c02Simple down = (c02Simple)obj;
				return this.n==down.n;
		}
		return false;
	}
	
}
class B{}

public class c02EqualsMain {

	public static void main(String[] args) {
		
		c02Simple ob1= new c02Simple(10);
		c02Simple ob2= new c02Simple(10);
		c02Simple ob3= new c02Simple(30);
		
		B ob4 = new B();
		System.out.println(ob1==ob2);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob1.equals(ob4));
		
		String a ="java";
		String b ="java";
		System.out.println();
		System.out.println(a==b);
		
		
	}

}
