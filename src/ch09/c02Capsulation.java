package ch09;

//캡슐화
// 특정 목젇을 가지는 기능 구현하는데 있어서 각 과정의 일부나 전부가 외부로의 노출이 
//불필요한 경우는 정보으닉(private)을 호합하여 각 과정을 세부기들의 순서를 지정하여
// 가용가능한 함수로 지정하는데 이를 캡슐화라고한다

class c02Engine{
	private void 흡입() {System.out.println("외부로투벝 공기를 흡입");};
	private void 압축() {System.out.println("공기를 압축");};
	private void 폭발() {System.out.println("폭발");};
	private void 배기() {System.out.println("배기");};

	public void EnginStart() {
		흡입();
		압축();
		폭발();
		배기();
	}
} 
class c02car{
	c02Engine engine= new c02Engine();
	void run() {
		//핸들기능 활성화
		//사이드미러 활성화
		//엔징 동착
		engine.EnginStart();
		
	}
	
}


public class c02Capsulation {

	public static void main(String[] args) {
		c02car hongcar = new c02car();
		hongcar.run();
		
		
	}

}
