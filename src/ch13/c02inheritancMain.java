package ch13;

class Parent{
	int x;
	int y;
	Parent(){
		System.out.println("Parent() 생성자 호출!");
	}
	Parent(int x){
		this.x=x;
		System.out.println("Son(int x) 생성자 호출!");
	}
	Parent(int x,int y){
		this.x=x;
		this.y=y;
	}

	
}

class Son extends Parent{
	int z;
	Son(){
		super(); // 상위 클래스의 디폴트 생성자 (Parent())를 호출
		System.out.println("son() 생성자 호출!");
	}
	Son(int x){
		super(x); // 상위클래스의 Parent(int x)를 호출
		System.out.println("Son(int x) 생성자 호출!");
	}
	Son(int x, int y){ 
		//상위클래스의 Parent(int x,int y)를 호출
		//z는 0값으로 초기화
		super(x,y);
	}
	Son(int x, int y,int z){
		//상위 클래스 의 Parent(int x,int y )를 홑출
		//z는 this.z에 초기화
		super(x,y); 
		this.z=0;
	}
	
	
	@Override
	public String toString() {
		return "Son [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}


public class c02inheritancMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Son ob =new Son();
		Son ob =new Son(10);
		System.out.println(ob.toString());
		Son ob2 = new Son(10,20);
		Son ob3 = new Son(10,20,30);
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());
		
	}

}
