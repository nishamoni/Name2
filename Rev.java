
public class Rev {

	public static void main(String[] args) {
		String s="This is a String line";
		int length=16;
		String r=" ";
		String k[]=s.split(" ");
		for(int i=0;i<length;i++){
			r=r+k[i];
			if(i!=length-1)
			r=r+"_";
		
		}
		System.out.println(r);

	}

}
