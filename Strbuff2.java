
public class Strbuff2 {

	public static void main(String[] args) {
		String s=new String("<cardno>685675663333</cardno><pin>7568</pin><cvv>553</cvv>");
		//System.out.println("cardno:"+ s.substring(9, 20));
		//System.out.println("pin:"+s.substring(35, 38));
		//System.out.println("cvv:"+s.substring(50, 52));
		String cardno= s.substring(9, 20);
		String pin=s.substring(35, 38);
		String cvv=s.substring(50, 52);
		System.out.println(cardno);
		if(cardno.charAt(0)=='4'){
			cardno="visa";
		}else if(cardno.charAt(0)=='5') {
			cardno="Amex";
		}else if(cardno.charAt(0)=='8') {
			cardno="Rupay";
			//System.out.println(cardno);
			
		}
		System.out.println(cardno);
		
		

	}
	

}
