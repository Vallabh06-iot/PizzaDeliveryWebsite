package constructoroverloading;

public class ConOverloading {
	public ConOverloading() {
		System.out.println("defaultt constructor");
	}
	public ConOverloading(int i) {
		System.out.println("single parameter with int value");
	}
	public ConOverloading(int i,int j) {
		System.out.println("double parameter with int values");
		
	}
	public ConOverloading(String str) {
		System.out.println("single parameter with string value");
	}
	public static void main(String[] args) {
		ConOverloading c1=new ConOverloading();
		ConOverloading c2=new ConOverloading(3);
		ConOverloading c3=new ConOverloading(3,78);
		// TODO Auto-generated method stub

	}

}
