package ch08;

 class ch01Person {
		String name;
		int age;
		float height; // 신장
		double weight; // 몸무게
		
		public static void main(String[] args) {
			
			ch01Person hong = new ch01Person();
			hong.name="홍길동";
			hong.age=55;
			hong.height=177.5f;
			hong.weight=70.4;
			System.out.printf("%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight);
			
			
			
		}


}
