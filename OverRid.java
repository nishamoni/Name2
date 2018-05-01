class Par1{
	void add(int a,int b) {
		System.out.println(a+b);
		
	}
	void sub() {
		System.out.println("B");
	}
}
class Child1 extends Par1{
	void mul(String s) {
		System.out.println("hi");
	}
	void can() {
		System.out.println("D");
	}
}
class Par2 extends Par1{
void add(int a,int b) {
	System.out.println(a-b);
	}
	void sub() {
		System.out.println("F");
	}

	
}
class Child2{
void mul() {
	System.out.println("A");
	}
	void can() {
		System.out.println("A");
	}

	
}
public class OverRid {

	public static void main(String[] args) {
		Par1 p=new Par1();
		p.add(4, 3);
		Child1 c=new Child1();
		c.add(10, 5);
		c.mul("s");
		c.add(8, 4);
		Par2 p2=new Par2();
		p2.add(10, 5);
		
	

	}

}
