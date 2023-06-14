package ch18;

class Tiger{
	String name;
	
	public Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
	
}

class Panda{
	String name;

	public Panda(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
	
}


public class c03GenericMain {

		public static <S> void PrintInfo(S[] array) {
			for(S el : array) {
				System.out.println(el.toString());
			}
		
		}
		
		
		public static  void PrintInfo2(Object[] array)
		{
			for(Object el : array)
			{
				if(el instanceof Tiger) {
					Tiger down = (Tiger)el;
					System.out.println(down);
				}else if(el instanceof Panda) {
					Panda down = (Panda)el;
					System.out.println(down);
				}
			}
		}
	public static void main(String[] args) {
		Tiger[] arr1= {new Tiger("호랑이"),new Tiger("호랭이"),new Tiger("호키")};
		PrintInfo(arr1);
		
		Panda[] arr2 = {new Panda("랫서팬더"), new Panda("중국팬더")};
		PrintInfo(arr2);
		Object[] arr3 = {new Panda("중국팬더"),new Tiger("시베리안호랑이"),new Panda("레서팬더")};
		PrintInfo2(arr3);
		
		
		
 	}

}
