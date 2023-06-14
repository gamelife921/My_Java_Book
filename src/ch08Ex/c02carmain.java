package ch08Ex;

class c02car{
	String owner;
	int speed,fuel;
	
	int Accel,Break,ShowInfo;
	
	void Accel(){
		 System.out.printf("%s + 님이 현재 속도 + %d + %d 로 가속합니다 \n ",owner,speed,speed+5);
	}
	void Break() {
		 System.out.printf("%s + 님이 현재 속도 + %d + %d 롤 감속합니다 \n",owner,speed,speed-5);
	}
	void ShowInfo() {
		System.out.printf("%s %d %d\n",owner,speed,fuel);
	}
}

public class c02carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c02car hongcar = new c02car();
		hongcar.owner="홍길동";
		hongcar.speed=10;
		hongcar.fuel =100;
		hongcar.Accel(); // owner + 님이 현재 속도 + speed + 에서 (speed+5)로 가속합니다가 출력
		hongcar.Break(); // owner + 님이 현재속도 + speed + 에서 (speed-5)로 감속속합니다가 출력
		hongcar.ShowInfo(); // owner,speed,fuel이 출력
		
		
		
		//System.out.printf("%s %d %d\n",hongcar.owner,hongcar.speed,hongcar.fuel);
		
	
	}

}
