package ch17;



public class c01NullPointerExceptionMain {
	public static void main(String[] args) {

		
		try {
		String str = null;
		System.out.println(str.toString());//NullPointerException 예외 객채가 생성되는 시점
		}catch(NullPointerException e) {
//			System.out.println("예외발생!!");
//			System.out.println(e.getCause());//예외 원인
//			System.out.println(e.toString()); // 예외객체 메세지(어디 에러인지 말해준다)
//			System.out.println(e.getStackTrace()); // 예외객체 식별정보
			
			e.printStackTrace(); // 어디가 문제인지 순서대로 알려준다
			
		}
		
		
		System.out.println("실행해야되는 코드1");
		System.out.println("실행해야되는 코드2");
		
		
		
		
		
	}
}
