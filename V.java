
abstract class V {
	
		int value=5;
		void setvalue(V v) {
			v.fact();
			
		}
		abstract void fact();		
		
}
class R extends V{
	public static void main(String[] args) {
		R r=new R();
		r.setvalue(r);//V v=new R();//can create object for child method and pass parent reference threw that object.
	}

	
	void can() {
		
	}
	@Override
	void fact() {
		
		
	}

	}
