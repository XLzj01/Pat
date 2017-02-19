package pat;

import java.util.LinkedList;
import java.util.Scanner;

public class B_1015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String startPoint = scanner.next();
		int count = scanner.nextInt();
		int reversal = scanner.nextInt();
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add(startPoint);
		boolean control = true;
		for (int i = 0; i < count; i++) {
			String currentPoint = scanner.next();
			String date = scanner.next();
			String nextPoint = scanner.next();
			if (control && startPoint.equals( currentPoint)) {
				control = false;
				linkedList.add(1, date);
				linkedList.add(2, nextPoint);
				continue;
			}
			if (linkedList.contains(currentPoint)) {
				int address = linkedList.indexOf(currentPoint);
				if (!linkedList.contains(nextPoint)) {
					linkedList.add(address + 1, nextPoint);
				}
				linkedList.add(address + 1, date);
				continue;
			} else if (linkedList.contains(nextPoint)) {
				int address = linkedList.indexOf(nextPoint);
				linkedList.add(address, date);
				linkedList.add(address, currentPoint);
			} else {
				linkedList.add(currentPoint);
				linkedList.add(date);
				linkedList.add(nextPoint);
			}
		}
		System.out.println(linkedList);
		scanner.close();
	}
}
