package ch16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class c07Fomatter {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.printf("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
		//포캐터 객체 생성(입력 받을때 포매팅)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/mm/dd");

		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		//포케터 객체 생성(출력할떄의 포매팅)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(fmtout.format(date));
	}

}
