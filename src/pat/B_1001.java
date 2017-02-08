package pat;

import java.util.Scanner;

public class B_1001 {

	public static void main(String[] args) throws Exception {
//		long startCurrentTimeMillis = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.nextLine();
		int temp = 0;
		StringBuffer stringBuffer = new StringBuffer();
		while (number > temp) {
			temp++;
			String tempString = scanner.nextLine();
			String[] tempArray = tempString.split("\\ ");
			long a = new Long(tempArray[0]);
			long b = new Long(tempArray[1]);
			long c = new Long(tempArray[2]);
			if (c - b < a) {
				stringBuffer.append("Case #" + temp + ": ture\n");
			} else {
				stringBuffer.append("Case #" + temp + ": false\n");
			}
		}
		System.out.println(stringBuffer.toString());
		scanner.close();
//		long endCurrentTimeMillis = System.currentTimeMillis();
//		System.out.println(endCurrentTimeMillis - startCurrentTimeMillis);
	}
}