package ch13;

//메서드 오버라이딩(함수 재정의)
//상속관계에서 상위 클래스의 메서드를 하위클래스가 재정의(고쳐서사용)하는 것을 허용하는 문법
//메서드의 헤더 부분은 동일하게 두고 바디({})의 로직을 다르게 함으로써 같은 상위클래스로부터
//물려 받은 메서드의 로직을 다양하게 둘수있다(다형성)

class Animal{
	public void Sound() {	System.out.println("소리를 냅니다.");}
}
class Dog extends Animal{

	@Override
	public void Sound() {
		System.out.println("멍멍 소리를 냅니다.");
	}
	
	
}
class cat extends Animal{
	//public void Sound() {	System.out.println("야옹 소리를 냅니다.");}
}


public class c03OvemidingMain {
	public static void main(String[] args) {
		Dog poppi = new Dog();
		cat  yummi = new cat();
		Animal mm = new Animal();	
		mm.Sound();
		
		poppi.Sound();
		yummi.Sound();
		
		Animal test = (Animal)poppi;
		test.Sound();
		
		
		
		

		
		
	}

}
