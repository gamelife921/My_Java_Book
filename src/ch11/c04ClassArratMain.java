package ch11;

class c04preson{
	String name;
	int age;
	@Override
	public String toString() {
		return "c04preson [name=" + name + ", age=" + age + "]";
	}
	
}


public class c04ClassArratMain {
	public static void main(String[] args) {
		
		c04preson list[] = new c04preson[3];
		list[0]= new c04preson();
		list[0].name="홍길동";
		list[0].age=55;
		
		list[1]= new c04preson();
		list[1].name="이정숙";
		list[1].age=34;
		
		list[2]= new c04preson();
		list[2].name="정우성";
		list[2].age=25;
		
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
	}
}
