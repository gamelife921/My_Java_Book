package ch16;

import java.util.Objects;

import org.apache.commons.lang3.builder.HashCodeBuilder;

class c03Simple{
	private int id; // 돋등객체 여부 판단하는 기준
	int n;
	
	
	c03Simple(int id ,int n){
		this.n=n;
		this.id=id;
	}
	
	@Override
	public int hashCode() {
		//final int PRIME= 31;
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		
		return "c03Simple@"+hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof c03Simple) {
			c03Simple down = (c03Simple)obj;
			return Objects.equals(this.id,down.id);
		}
		return false;
	}
	
	
	
	// toString() 재정의
	// equals()재정의
	// hashcode()재정의
	
}

public class c03HashcodMain {

	public static void main(String[] args) {
		c03Simple ob1 = new c03Simple(1,5);
		c03Simple ob2 = new c03Simple(5,6);
		
		System.out.println();
		//System.out.println(ob1.getClass());
		//System.out.println(ob1.toString());
		//System.out.println(ob2.toString());
		//System.out.println(ob1.hashCode());
		System.out.printf("%x\n",ob1.hashCode());

		System.out.println();
		System.out.println(ob1.hashCode()); // 재정의된 hashcode
		System.out.println(ob2.hashCode()); // 재정의된 hashcode
		System.out.println(System.identityHashCode(ob1)); //실제 객체 위치
		System.out.println(System.identityHashCode(ob2)); // 실제 객체 위치
	}

}
