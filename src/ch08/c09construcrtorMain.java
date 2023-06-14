package ch08;
//클래스 선언시 생성자함수를 하나도 명시하지 않았을때는 디폴트 생성자가 주입이 되나
// 하나 이상의 생성자 함수가 명시되면 디폴트생성자는 주입되지 않는다.

                    
class c09simple{
	c09simple(){}
	c09simple(int x){}
}

public class c09construcrtorMain {

	public static void main(String[] args) {
		
		c09simple obj1= new c09simple();
	}

}
