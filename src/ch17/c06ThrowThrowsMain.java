package ch17;

//I. throw
//HE/She. throws

public class c06ThrowThrowsMain {
	
	public static void Ex1() {	
		try {
		throw new NullPointerException("Ex1에서 발생시킨 Null예외");
		}catch(Exception e) {
		System.out.println("Ex1함수 내에서 예외처리 했다");
	}
}
	public static void Ex2() throws NullPointerException{
		throw new NullPointerException("Ex1에서 발생시킨 Null예외");
	}
	
	public static void main(String[] args) {
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		try{
			Ex2();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("실행코드3");
	
		
	}

}
