package pat;

import java.util.Scanner;

public class B_1013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		String[] split = nextLine.split("\\ ");
		StringBuffer buffer = new StringBuffer();
		boolean door = true;
		for (int i = 0; i < split.length; i++) {
			int a = new Integer(split[i]);
			for (int j = 0; j < a; j++) {
				if (door && i != 0) {
					buffer.insert(0, i);
					door = false;
					continue;
				}
				buffer.append(i);
			}
		}
		System.out.println(buffer);
		scanner.close();
	}
}
