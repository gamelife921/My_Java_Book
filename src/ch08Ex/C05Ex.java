package ch08Ex;

class C05Simple{
	String type;
	int intSum;
	long intSub;
	long intMul;
	
		int sum(String srt,int ...a) {
			intSum=0;
			type = srt;
			
			for(int on : a) {
			this.intSum +=on;
			
			}return intSum;
		}
	
		long sub(String srt,int ...a) {
			intSub=0;
			type = srt;
			
			for(int on : a) {
				this.intSub -=on;
				
				}return intSub;
				
			
			
		}
		
		long mul(String srt,int ...b) {
			intMul=0;
			type=srt;
			
			for(int arg : b) {
				this.intMul *=arg;
			}return intMul;
		}

		@Override
		public String toString() {
			return "C05Simple [type=" + type + ", intSum=" + intSum + ", intSub=" + intSub + ", intMul=" + intMul + "]";
		}

		
		
	}
	
	
	//sum함수를 main에 있는 인자에 맞게 오버로딩합니다.
	//toString함수 오버라이딩 합니다.

public class C05Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C05Simple ob = new C05Simple();
		
		ob.sum("모든Int합",10,20,30,40,50,60,70);		//받은 모든수의 합을 intSum에저장		
		System.out.println(ob.toString());
		
		ob.sub("모든Int차",100,20,30,40,50);			//차는 입력받은 인자중에 제일 큰수에서
													//나머지 모든 수들을 빼줍니다.
													//그 결과를 intSub에저장
		System.out.println(ob.toString());
		
		ob.mul("모든Int곱",10,20,30,40,50,60,70);		//모든 수의 곱의 결과를 intMul에 저장
		System.out.println(ob.toString());
		

	}

}
