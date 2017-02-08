package pat;

import java.util.Scanner;

public class B_1006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tempString = scanner.nextLine();
		String[] tempArray = tempString.split("\\ ");
		String a = tempArray[0];
		String b = tempArray[1];
		String c = tempArray[2];
		String d = tempArray[3];

		int numble1 = getNumble(a, b);
		int numble2 = getNumble(c, d);
		System.out.println(numble1 + numble2);
		scanner.close();
	}

	public static int getNumble(String a, String b) {
		StringBuffer count = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(0)) {
				count.append(a.charAt(i));
			}
		}
		Integer numble = new Integer(count.toString());
		return numble;
	}
}
