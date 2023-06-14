package ch11;
import java.util.Scanner;

public class c01ArratMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int [] arr1 = new int[4];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		
		System.out.println("길이 : "+arr1.length);
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		//개량된 for문
		for(int el:arr1) {
			System.out.println(el);
		}
		
		System.out.println();
		//Stream 메서드 이용한 방식
		//Arrays.Stream(arr1).forEach(el->{System.out.println(el)});
		System.out.println();

		double arr2[];
		arr2= new double[5];
		
		//5개의 정수값을 입력 받아 int형 배열에 저장하고 
		//최대값,최소값,천제합을 출력합니다.
		
		
		
	}

}
