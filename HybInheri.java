class A{
	void add() {
		System.out.println("A");
	}
	
}
class B extends A{
	void sub() {
		System.out.println("B");
	}
	
}
class C extends A{
	void mul() {
		System.out.println("C");
	}
	
}
class D extends A{
	void div() {
		System.out.println("D");
	}
	
}
class E extends B{
	void cancel() {
		System.out.println("E");
	}
	
}
class F extends C{
	void ret() {
		System.out.println("F");
	}
}
class G extends D{
	void riv() {
		System.out.println("G");
	}
}
public class HybInheri {

	public static void main(String[] args) {
		B b=new B();
		b.add();
		b.sub();
		C c=new C();
		c.add();
        c.mul();
        D d=new D();
        d.add();
        d.div();
        E e=new E();
        e.add();
        e.cancel();
        e.sub();
	}

}
