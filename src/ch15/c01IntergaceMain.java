package ch15;

interface Remocon{
	void on();
	void off();
	void ChangeChannel(int channel);
}


class TV implements Remocon{
	int Channel;
	@Override
	public void on() {System.out.println("TV를 켭니다");}

	@Override
	public void off() {System.out.println("TV를 끝니다");}

	@Override
	public void ChangeChannel(int channel) {
		System.out.println("Tv채널 변경"+channel);
		this.Channel=channel;
	}
	
	
}

class Radio implements Remocon{
	int Channel;
	@Override
	public void on() {System.out.println("Radio를 켭니다");}

	@Override
	public void off() {System.out.println("Radio를 끕니다");}

	@Override
	public void ChangeChannel(int channel) {
		System.out.println("Radio채널 변경"+channel);
		this.Channel=channel;
	}
	
	
}
interface Browser{
	void Searchable(String url);
}


class SmartTv extends TV implements Browser{

	@Override
	public void Searchable(String url) {
		System.out.println("브라운저에서 URL" +url+"접속요청 합니다");
		
	}
	
	
}

public class c01IntergaceMain {
	public static void TurnOn(Remocon controller) {
		controller.on();
	}
	public static void TurnOff(Remocon controller) {
		controller.off();
	}
	
	public static void ChangeChannel(Remocon controller,int channel) {
		controller.ChangeChannel(channel);
	}
	public static void SearchBrowser(Browser browser,String url) {
		browser.Searchable(url);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1= new TV();
		Radio radio1 =new Radio();
		
//		TurnOn(tv1);
//		TurnOn(radio1);
//		ChangeChannel(tv1,10);
//		
//		TurnOff(tv1);
//		TurnOff(radio1);
		
		SmartTv tv2 = new SmartTv();
		TurnOn(tv2);
		ChangeChannel(tv2,100);
		TurnOff(tv2);
		SearchBrowser(tv2,"www.naver.com");
	}

}
