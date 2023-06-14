package ch09;

// 접근한 정자
// public		: 모든클래스에서 접근가능
// default 		: 동일 패키지에 솓한 클래스에서만 접근가능
// protected 	: 동일 패키지 or 상속관계의 하위클래스에서만 접근가능
// private 		: 현재 클래스에서마 접근가능


class c01preson{
	//속성
	String name;	//이름
	private String id; 		// 주민등록번호
	private int age; 		// 나이
	private float weight; 	// 몸무게
	private double height; 	// 신장
	private int salary;		// 연봉
	
	// 생성자
	public c01preson(String name, String id, int age, float weight, double height, int salaty) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salaty;
	}

	//기능
	//Gettr and Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	

}



public class ch01infoHide {

	public static void main(String[] args) {
		c01preson hong = new c01preson("홍길동","1111-1111",44,77.f,177.5,8000);
		hong.name="이종현";
		hong.setSalary(9000);
		System.out.println(hong.getid());
		System.out.println(hong.getage());
		System.out.println(hong.getweight());
		System.out.println(hong.getheight());
		System.out.println(hong.getsalary());
	}

}
