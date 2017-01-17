package pat;

import java.util.ArrayList;
import java.util.Scanner;

public class B_1003 {
	public static void main(String[] args) throws Exception {
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		String[] strings = input.split("\\ ");
//		int startNumber = new Integer(strings[0]);
//		int endNumber = new Integer(strings[1]);
		long startCurrentTimeMillis = System.currentTimeMillis();
		int startNumber = 5;
		int endNumber = 100;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		for (int i = 3;; i++) {
			arrayList.add(i);
			if (i != 2 && i % 2 != 0) {
				int temp = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						temp++;
					}
					if (temp > 2) {
						arrayList.remove(arrayList.size() - 1);
						break;
					}
				}
			} else {
				arrayList.remove(arrayList.size() - 1);
				continue;
			}
			if (arrayList.size() >= endNumber) {
				break;
			}
		}
		int count = 0;
		if (startNumber != 0) {
			startNumber = startNumber - 1;
		}
		for (int i = startNumber; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
			count++;
			if (count % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
		long endCurrentTimeMillis = System.currentTimeMillis();
		System.out.println("=========================================");
		System.out.println(endCurrentTimeMillis - startCurrentTimeMillis);
	}
}