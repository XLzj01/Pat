package pat;

import java.util.Arrays;
import java.util.Scanner;

public class B_1009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		char[] charArray = nextLine.toCharArray();
		if (charArray[0] == charArray[1] && charArray[1] == charArray[2] && charArray[2] == charArray[3]) {
			System.out.println("N - N = 0000");
			return;
		}
		// Arrays.sort(charArray);
		// StringBuffer bigStringBuffer = new StringBuffer();
		// bigStringBuffer.append(charArray[3]).append(charArray[2]).append(charArray[1]).append(charArray[0]);
		// StringBuffer smallStringBuffer = new StringBuffer();
		// smallStringBuffer.append(charArray[0]).append(charArray[1]).append(charArray[2]).append(charArray[3]);
		Integer answer = 0;
		while (answer != 6174) {
			Arrays.sort(charArray);
			StringBuffer bigStringBuffer = new StringBuffer();
			bigStringBuffer.append(charArray[3]).append(charArray[2]).append(charArray[1]).append(charArray[0]);
			StringBuffer smallStringBuffer = new StringBuffer();
			smallStringBuffer.append(charArray[0]).append(charArray[1]).append(charArray[2]).append(charArray[3]);
			answer = (new Integer(bigStringBuffer.toString()) - new Integer(smallStringBuffer.toString()));
			System.out.println(bigStringBuffer + " - " + smallStringBuffer + " = " + answer);
			charArray = answer.toString().toCharArray();
		}
		scanner.close();
	}
}
