package ch13;

//상속
//상위(부모,슈퍼) 클래스의 속성과 기능을 하위클래스에서 그대로 받아 사용할 수 있도록 허용한 문법
//받은 하위클래스는 상위 클래스의 속성과 기능 이외에 맴버를 추가할 수 있다
//extends 예약어를 사용한다

//상속 사용이유
//1 확장성
//2 유지보수
//3 가독성

class Point2D{
	int x;
	int y;
	Point2D(){
		System.out.println("pont2D 에서 pont3D 호출");
	}
	
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
}
class Point3D extends Point2D{
	int z;
	Point3D(){
		super();
		System.out.println("pont3D 호출");
	}
	
}





public class c01lnheritanceMain {
	public static void main(String[] args) {
	
		Point3D ob = new Point3D();
		ob.x=100;
		ob.y=200;
		ob.z=300;
		
		System.out.println(ob.toString());
		
		

	}

}
