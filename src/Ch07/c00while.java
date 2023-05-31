package Ch07;

import java.util.Scanner;

public class c00while {

	public static void main(String[] args) {

		
		
		//while(조건식){종석문	}
	
//		
//		int i = 1; 		// 1 탈출용 변수
//		while(i<=10) {	// 2 탈출식 조건식
//		System.out.println("HELLO WORLD");
//		i++; 			// 3 탈출을 위한 연산
//		
//		}
//		System.out.println("i : " +i);
	
		//02 1 -10 까지의 합
//		int i = 1; 		// 1 탈출용 변수
//		int sum=0;
//		while(i<=10) {	// 2 탈출식 조건식
//		System.out.println("i : " +i);
//		sum = sum +i;
//		
//		i++; 			// 3 탈출을 위한 연산
//		
//		}
//		System.out.println("SUM : " +sum);
	
		
		// 03 1- N 까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		// int i = 1; 		// 1 탈출용 변수
//		int sum=0;
//		while(i<=n) {	// 2 탈출식 조건식
//		System.out.println("i : " +i);
//		sum = sum +i;
//		
//		i++; 			// 3 탈출을 위한 연산
//		
//		}
//		System.out.println("SUM : " +sum);
		
		//문제
		// N - M 까지의 합을 구합니다 (n<m)
//		int n=sc.nextInt(), m=sc.nextInt();
//		int sum=0;
//		if(n>m) {
//		while(n == m) {
//			System.out.println("n : "+n);
//			System.out.println("m : "+m);
//			sum = sum+(n+m);
//			m++;
//			n++;
//		}	System.out.println("sum : " +sum);
//		}else {
//			System.out.println("m은 n보다 그면 안된다.");
//		}
		
		// 1 - N 까지 수증에 짝수 홀수의 합을 각각 출력
		
//		int odd = 0;
//		int even=0;
//		while(i<= m) {
//			System.out.println("i : " +i);
//			sum = sum +i;
//			if(i%2==0) {
//				even = even+i;
//			}else {
//				odd = odd +i;
//			}
//			i++;
//		}	
//		System.out.println("sum : " +sum);
//		System.out.println("짝수 : " +even);
//		System.out.println("홀수 : " +odd);
//		sc.close();
		
		
		// 1 - N 까지 수증에 3의 배수만 출력하고 그합도 출력
//		Scanner sc= new Scanner(System.in);
//		int i=0,n=sc.nextInt(), sum =0;
//		
//		while(i<=n) {
//			if(i%3==0) {
//				sum = sum +i;
//				System.out.println("n : "+ i);
//			}
//			
//			i++;
//		} System.out.println("3의 배수 합 : " +sum);
			
		
		// 1 - N 수중에 4의 배수를 출력하고 4의 배굿가 아닌 나머지의 합을 구하세요
		
//		Scanner sc= new Scanner(System.in);
//		int i=0,n=sc.nextInt() , sum =0 ,min = 0, max= 0;
//		
//		while(i<=n) {
//			max = max + i;
//			if(i%4==0) {
//				sum = sum +i;
//				System.out.println("n : "+ i);
//			} else {
//				min = min + i;
//			}
//			
//			i++;
//		} 
//		System.out.println("4의 배수 합 : " +sum);
//		System.out.println("4의 나머지 합 : " +min);
//		System.out.println("4의 총합 : " +max);
		
		
		//ex) 2단
		//2x 9 = 18
		//2 x 8 = 16
		

//		int i=0,n=0,a=2;
//		while(i<=10) {
//			System.out.println("n : "+ n);
//			n= a * i;
//			i++;
//		} 
//			
//		Scanner sc= new Scanner(System.in);
//		int i=9,n=2,a=2;
//		while(i>=0) {
//			System.out.println(n+" X "+i+ " = " +(n*i));
//			i--;
//		}
		
//===============================================================================================
		
		// 중첩 while 
		
		//전체 구구단 출력
		//2 - 9 단 출력
//		int dan= 2;
//		int i=1;
//		while(dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i
//						);
//				i++;
//			}
//			
//			dan ++;
//		}
		//전체 구구단 역순
//		int dan= 2;
//		int i=9;
//		while(dan<=9) {
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i
//						);
//				i--;
//			}
//			
//			dan ++;
//		}
//		
//		int dan= 9;
//		int i=1;
//		while(dan>=2) {
//			i=9;
//			while(i<=9) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i
//						);
//				i++;
//			}
//			
//			dan --;
//		}
		
		//*****
		//*****
		//*****
//		int i=0;
//		int j=0;	
//		while(i<4) {
//			j=0;
//				while(j<5) {
//					System.out.print("*");
//					j++;
//				}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc= new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;	
//		while(i<h) {
//			j=0;
//				while(j<5) {
//					System.out.print("*");
//					j++;
//				}
//			System.out.println();
//			i++;
//		}

		//*
		//**
		//***
		//****
		//*****
//		int i=0;
//		int j=0;	
//		while(i<5) {
//			j=0;
//				while(j<=i) {
//					System.out.print("*");
//					j++;
//				}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;	
//		while(i<h) {
//			j=0;
//				while(j<=i) {
//					System.out.print("*");
//					j++;
//				}
//			System.out.println();
//			i++;
//		}
		
		//*****
		//****
		//***
		//**
		//*
		
//		int i=0;
//		int j=0;	
//		while(i<=5) {
//			j=0;
//				while(j<=4-i) {
//					System.out.print("*");
//					j++;
//				}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;	
//		while(i<=h) {
//			j=0;
//				while(j<=(h-1)-i) {
//					System.out.print("*");
//					j++;
//				}
//			System.out.println();
//			i++;
//		}
		
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		
//		int i=0;
//		int j=0;	
//		while(i<=9) {
//			j=0;
//				
//			if(i<5) {
//				j=0;
//				while(j<=i) {
//					System.out.print("*");
//					j++;
//				}
//			}else {
//				j=0;
//				while(j<=8-i) {
//					System.out.print("*");
//					j++;
//				}
//	
//			}
//			System.out.println();
//			i++;
//		}	
			
//					
//				
//			
//			System.out.println();
//			i++;
//		}
		
		
		//      *
		//     ***
		
		//   *******		
//		Scanner sc=new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<h) {
//			j=0;
//			k=0;
//				while(j<=h-i) {
//					System.out.print(" ");
//					j++;
//				}
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			System.out.println();
//			i++;
//		}
		
		
		//   *******
		//	  *****
		//	   ***
		//      *
		Scanner sc=new Scanner(System.in);
		int h = sc.nextInt();
		int i=0;
		int j=0;
		int k=0;
		
		while(i<h) {
			j=0;
			k=0;
				while(j<=i-1) {
					System.out.print(" ");
					j++;
				}
				while(k<=h-(2*i)) {
					System.out.print("*");
					k++;
				}
			System.out.println();
			i++;
		
		}
		
		
		
		
		
		
	}
	

}
