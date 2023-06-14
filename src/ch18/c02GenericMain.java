package ch18;

class Person{
	String name;
	String age;
	String gender;
	public Person(String name, String age,String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender =gender;
	}
	
}
class Man extends Person{

	public Man(String name, String age ,String gender) {
		super(name, age , gender);
	}
	
}

class Woman extends Person{
	public Woman(String name, String age ,String gender) {
		super(name, age ,gender);
	}
	
}


class Couple<X extends Person,Y extends Person>{
	private X member1;
	private Y member2;
	
	Couple(X member1, Y member2){
		this.member1 = member1;
		this.member2 = member2;
	}

	void ShowInfo() {
		System.out.println("M1 : "+member1);
		System.out.println("M2 : "+member2);
	}

}
class Animal{
	String kind;
}
class Dog extends Animal{
	Dog(String kind){
		this.kind=kind;
	}
	
}
class Cat extends Animal{
	Cat(String kind){
		this.kind=kind;
	}
}



public class c02GenericMain {

	public static void main(String[] args) {
		
		Couple<Man,Woman> couple1=new Couple<Man,Woman>(new Man("철수","20","M"), new Woman("영희","20","W"));
		couple1.ShowInfo();
		
		Couple<Man,Man> couple2=new Couple<Man,Man>(new Man("철수","20","M"), new Man("길동","20","W"));
		couple2.ShowInfo();
	}

}
