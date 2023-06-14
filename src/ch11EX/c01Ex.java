package ch11EX;
import java.util.Arrays;
import java.util.Scanner;
public class c01Ex {

	public static void main(String[] args) {
		//5개의 정수값을 입력 받아 int형 배열에 저장하고 
		//최대값,최소값,천제합을 출력합니다.
		Scanner sc = new Scanner(System.in);	
		int cox[] =new int[5];

		
		for(int i=0;i<cox.length;i++){
			cox[i]=sc.nextInt();
			System.out.println(Arrays.stream(cox).max().getAsInt());
			System.out.println(Arrays.stream(cox).min().getAsInt());
			System.out.println(Arrays.stream(cox).max().getAsInt());
			
			
//			int max=cox[0];
//			int min=cox[0];
//			int sum=0;
//			for (int el:cox) {
//				if(max<el) {
//					max=el;
//				}
//				if(min>el) {
//					min=el;
//				}
//				sum+=el;
//			}
//			System.out.printf("%d %d %d\n",max,min,sum);
		}
		
	}
}
