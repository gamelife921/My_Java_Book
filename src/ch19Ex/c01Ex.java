package ch19Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c01Ex {
	
	public static void func1(List<String> list) {
		list.add("AAAAAAAA");list.add("BB");list.add("CCCCCCC");
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		
		for(String el : list) {
			if(el.length()>5) {
				System.out.println(el);
			}
		}
		
		//func1함수 완성하기
		
		
	}
	public static List<String> func2() {
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 입력받는 코드를 작성하세요.
		
		
		
		List<String> inlist =  new ArrayList<String>();
		Scanner lis = new Scanner(System.in);
		String list;

		
		
//		
//		for(int i=0;i<=10;i++) {
//			System.out.print(i+" 번째 값 입력 : ");
//			list = lis.next();
//			if(list.length()>=5) {
//				inlist.add(list);
//			}
//		}
//		
		

		//func2함수 완성하기
		return inlist;
	}
	public static void func3() {
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		//짝수의 값만 입력받는 코드를 작성하세요.
		//func3함수 완성하기
	}
	public static void main(String[] args) {
		func1(new ArrayList());	
		
			
		
		List<String> list = func2();
		System.out.println(list);
		
		
		func3();
	}
}
