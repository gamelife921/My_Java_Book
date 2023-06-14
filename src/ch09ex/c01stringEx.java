package ch09ex;
import java.util.Scanner;

class profile{
	private String name;
	private String addr;
	private String job;
	private String major;
	//생성자
	//1) 디폴트 생성자 삽입
	private profile(){}
	//2) 모든 인자를 받는 생성자
	public profile(String name, String addr, String job, String major) {
		super();
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	
	//3) 문자열로 인자를 한번에 받아서, 를 기준으로 잘라내어 각 속성에 저장
	//"홍길동, 대구 ,프로그래머 " > [홍길동,대구,프로그래머,컴퓨터공학]
	public profile(String args) {//"홍길동,대구,프로그램머,컴퓨터공학"
		
		args=args.trim();//앞뒤 공백제거
		String arr[]=args.split(",");//,기준으로 잘내기
		this.name=arr[0];
		this.addr=arr[1];
		this.job=arr[2];
		this.major=arr[3];
	}
	//toString()재정의
	@Override
	public String toString() {
		return "profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	boolean isContain(String findstr) {
		//fidstr 의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true리턴
		//아니면 false리턴
		findstr = findstr.trim();
	
		if(this.name.contains(findstr)) {
			return false;
		}else if(this.addr.contains(findstr)){
			return false;
		}else if(this.job.contains(findstr)){
			return false;
		}else if(this.major.contains(findstr)){
			return false;
		}
		return false;
	}
	boolean isEquals(String str) {
		//인자로 받은 str문자열을 "," 단우리 잘라내어서 각각 나눠진 문자열이
		//name,addr,job,major 와 일치하면true , 하나라도 다른게 있으면 false를 리턴
		Scanner one= new Scanner(System.in);
		str= one.nextLine();
		
//		System.out.println(one.substring(2));
//		System.out.println(one.substring(2,5));
		
		
		return false;
	}
	
	
	

}

public class c01stringEx {
	public static void main(String[] args) {

		profile hong =new profile("홍길동,대구,프로그래머,컴퓨터공학");
		System.out.println(hong.toString());
	}

}
