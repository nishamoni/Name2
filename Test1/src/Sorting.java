import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int x;
		String temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter nunber of names:");
		x = s.nextInt();
		String names[] = new String[x];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter all the names:");
		for (int i = 0; i < x; i++) {
			names[i] = s1.nextLine();
		}
		for (int i = 0; i < x; i++) {
			for (int j = i + 1; j < x; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
				
			}

		}
		for (int i = 0; i < x; i++) {
			System.out.println(names[i]);

		}

	}

}
