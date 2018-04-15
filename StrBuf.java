
public class StrBuf {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("This is a String");
		String rev=" ";
		for( int i=15;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		///System.out.println(s.reverse());
		System.out.println(s.substring(2, 9));
		
		

	}

}
