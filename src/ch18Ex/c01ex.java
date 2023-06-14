package ch18Ex;

class 재료{
	
}

class 카라멜 extends 재료{

	@Override
	public String toString() {
		return "카라멜";
	}
	
}

class 버터옥수수 extends 재료{

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}

class 민초 {
	@Override
	public String toString() {
		return "민초";
	}
}



class PopCorn<T>{
	private T Cok;
	PopCorn(T Cok){
		this.Cok=Cok;
	}
	void ShowInfo(){
		System.out.println(Cok.toString()+"맛 팝콘");
	}
	
}


public class c01ex {
	public static void main(String[] args) {
		PopCorn<카라멜> ob1 = new PopCorn<카라멜>(new 카라멜());
		ob1.ShowInfo();	//"캬라멜맛 팝콘" 이 출력
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		ob2.ShowInfo();	//"옥수수맛 팝콘" 이 출력
		
		//민초는 제너릭으로 선택되지 않도록 합니다
		PopCorn<민초> ob3 = new PopCorn<민초>(new 민초());
		 
		
	}
}
