package ch10;

class TV{
	BasicController basicControllerl;
	ExtraController extraController;
	TV(){
		basicControllerl = new BasicController();
		extraController = new ExtraController();
	}
	void TVInfo() {
		basicControllerl.showinfo();
	}

}
class BasicController{
	// Baisc controller
		// oN/oFF
		// ChangeChanne1
		// setVolumn
	ONOFF onoff;
	Channel channel;
	Volume volume;
	void setOnoff(ONOFF onoff) {
		this.onoff = onoff;
	}
	void setChannel(Channel channel) {
		this.channel=channel;
	}
	void setVolumn(Volume volume) {
		this.volume = volume;
	}
	void showinfo() {
		System.out.println("현재 ONOFF: "+onoff.isOn);
		System.out.println("현재 channel: "+channel.curChannel);
		System.out.println("현재 volume: "+volume.curVolumn);
	
	
	}
	
}

class ONOFF{
	boolean isOn;
	void ON() {System.out.println("POWER ON");isOn=true;}
	void OFF() {System.out.println("POWER OFF");isOn=false;}
}

class Channel{
	
	int curChannel;
	void setChannel(int channel) {
		curChannel=channel;
	}
		
}

class Volume{
	int curVolumn;
	void setVolumn(int volume) {
		curVolumn=volume;
	}
}

class ExtraController{
	//Extra Controller
	//Module internetSearching
	//Module - Netflex
	
}

public class c02FuntionRef {

	public static void main(String[] args) {
		TV tv1 = new TV(); //basicController,extarController
		tv1.basicControllerl.setOnoff(new ONOFF());
		tv1.basicControllerl.setChannel(new Channel());
		tv1.basicControllerl.setVolumn(new Volume());
		
		tv1.TVInfo();
		tv1.basicControllerl.onoff.ON();
		tv1.TVInfo();
		
		tv1.basicControllerl.onoff.ON();
		tv1.basicControllerl.channel.setChannel(21);
		tv1.basicControllerl.volume.setVolumn(21);
		
	}

}
