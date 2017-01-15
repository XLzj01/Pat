package pat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_1001 {
	private static Scanner scanner = new Scanner(System.in);

	// int number = scanner.nextInt();
	// Map<Integer, String[]> arrays = new HashMap<Integer, String[]>();
	// scanner.nextLine();
	// int temp = 0;
	// while (number > temp) {
	// temp++;
	// String tempString = scanner.nextLine();
	// String[] tempArray = tempString.split("\\ ");
	// arrays.put(temp, tempArray);
	// }
	// int i = 0;
	// while (number > i) {
	// i++;
	// String[] array = arrays.get(i);
	// long a = new Long(array[0]);
	// long b = new Long(array[1]);
	// long c = new Long(array[2]);
	// if (c - b < a) {
	// System.out.println("Case #" + i + ": ture");
	// } else {
	// System.out.println("Case #" + i + ": false");
	// }
	// }

	public static void main(String[] args) throws Exception {
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
	}
}