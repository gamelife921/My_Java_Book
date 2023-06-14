package ch15;

interface Tire{
	void run();
}

class 한국타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("한국타이어 굴러 갑니다");
		
	}
	
}

class 금호타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어 굴러 갑니다");		
	}
	
}

class car{
	Tire Fl;
	Tire Fr;
	Tire Bl;
	Tire Br;
	car(){
		Fl =new 한국타이어(); 	//Upcasting
		Fr= new 한국타이어();	//Upcasting
		Bl=new 한국타이어();	//Upcasting
		Br=new 한국타이어();	//Upcasting
	}
	void run() {
		Fl.run();
		Fr.run();
		Bl.run();
		Br.run();
	}
	
}


public class c02InerfacMain {

	public static void main(String[] args) {
		car car1=new car();
		car1.run();

		car1.Fr=new 금호타이어();
		System.out.println();
		car1.run();
	}

}
