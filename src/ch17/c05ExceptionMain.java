package ch17;

public class c05ExceptionMain {
	public static void main(String[] args) {
		
		try {
		String str=null;
		String r =str.toString();	//Null 예외
		int arr[]= {10,20,30};		//배열 예외
		arr[5]=100;				
		
		System.out.println(15/0);	//산술 예외
		}
//		catch(NullPointerException e) {System.out.println("Null예외");}
//		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Arr예외");}
//		catch(ArithmeticException e) {System.out.println("산술예외");}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
