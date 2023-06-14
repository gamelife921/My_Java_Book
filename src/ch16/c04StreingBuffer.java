package ch16;

public class c04StreingBuffer {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		System.out.println("STR1 : "+System.identityHashCode(str1));
		String str2 = "World";
		
		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println("STR1 : "+System.identityHashCode(str1));
	
		long startTime = System.currentTimeMillis();
		//기본 덧붙이가
//		String str="";
//		for(int i=0; i<=100000;i++) {
//			str="H";
//		}
		//StringBuffer로 문자열 붙이기
		StringBuffer buffer =new StringBuffer();
		String str="";
		for(int i=0; i<=100000;i++) {
			buffer.append("H");
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("소요시간 : "+(endTime-startTime)+"ms");
		//System.out.println(buffer);
	
	
	
	
	
	}

}
