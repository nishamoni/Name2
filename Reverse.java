
public class Reverse {
	public static void main(String[] args) {
		int org=123;
		int rev=0;
		int remainder;
		while(org!=0){
			remainder=org%10;
			rev=rev*10+remainder;
			org=org/10;
		}
		System.out.println(rev);
	}

}
