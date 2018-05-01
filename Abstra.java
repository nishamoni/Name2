abstract class A{
	int value=4;
	void setvalue() {
		System.out.println(value);
	}
	abstract void makevalue();
}
class S extends A{

	@Override
	void makevalue() {
	System.out.println(2*value);
		
		
		
	}
	
}
public class Abstra {

	public static void main(String[] args) {
		//A a=new A();
		S b=new S();
		b.setvalue();
		b.makevalue();

	}

}
