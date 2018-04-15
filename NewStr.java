
public class NewStr {

	public static void main(String[] args) {
		String s=new  String("This is a String");
		String Und=" ";
		//String a[]=new String[2];
		//a[0]="java";
		//a[1]="php";
		String k[]=s.split(" ");
		for(int i=0;i<4;i++) {
			Und=Und +k[i];
			if(i!=3)
			Und=Und+"_";
			
		}
		System.out.println(Und);

	}

}
