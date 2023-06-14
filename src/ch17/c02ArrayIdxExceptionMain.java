package ch17;


public class c02ArrayIdxExceptionMain {
	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30}; 
		try {
		for(int i=0; i<4;i++) {
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			//e.printStackTrace();
			e.toString();
		}
		System.out.println("HELLOWROLD");
		System.out.println("HELLOWROLD");
		
		
	}
}
