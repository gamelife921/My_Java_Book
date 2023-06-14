package ch10.EX;

class c01Buyer {
	private int MyMoney;
	private int AppleCnt;

	
	public c01Buyer(int myMoney, int appleCnt) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}

	public void Pay(c01Seller seller, int monery) {
		// myMoney 에서 monery만큼 차감 //2 seller 로부터 사과개수 받기
		MyMoney -= monery;
		// 1 seller 에게 moneny전달
		int cnt = seller.Receive(monery);

		// 3 사과개수를 멤버인 AppleCnt 누적
		AppleCnt += cnt;
	}

	public void ShowInfo() {
		// 속성 정보를 Console에 출력
		System.out.println("보유 금액 : "+MyMoney);
		System.out.println("사과 개수 : "+AppleCnt);
		
	}
}


class c01Seller {
	private int MyMoney;
	private int AppleCnt;
	public int price;
	
	
	public c01Seller(int myMoney, int appleCnt, int price) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		this.price = price;
	}

	public int Receive(int monery) {
		// 1 money 를 MyMoney 에 누적
		MyMoney += monery;
		// 2 money 에 해당괴는 만큼 사과개수를 계산
		int revcnt = monery / price;
		
		// 2 AppleCnt에서 계산된 만큼의 사과 계수를 자감
		AppleCnt -= revcnt;
		// 3 계산된 사과 개수를 리턴
		
		
		return revcnt;
	}

	public void ShowInfo() {
		// 속성 정보를 Console에 출력
		System.out.println("보유 금액 : "+MyMoney);
		System.out.println("사과 개수 : "+AppleCnt);
		System.out.println("개당 가격 : "+price);
	}
}

public class ExMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c01Seller seller = new c01Seller(100000,100,1000); //보유 금액, 사과 개수 , 개당가격
		c01Buyer buyer01 = new c01Buyer(10000,0); //보유 금액 , 사과 개수
		c01Buyer buyer02 = new c01Buyer(20000,0); //보유 금액 , 사과 개수
		c01Buyer buyer03 = new c01Buyer(30000,0); //보유 금액 , 사과 개수
		buyer01.Pay(seller, 2000);
		buyer02.Pay(seller, 5000);
		buyer03.Pay(seller, 3000);
		
		System.out.println("---판매자 정보----");
		seller.ShowInfo();
		
		System.out.println("---구매자 정보----");
		System.out.println("-buyer01-");
		buyer01.ShowInfo();
		
		System.out.println("-buyer02-");
		buyer02.ShowInfo();
		
		System.out.println("-buyer03-");
		buyer03.ShowInfo();
	}

}
