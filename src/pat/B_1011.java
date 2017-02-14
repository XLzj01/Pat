package pat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_1011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		nextLine = nextLine + "!";
		int length = nextLine.length();
		for (Integer i = 0; i < 10; i++) {
			String[] split = nextLine.split(i.toString());
			if (split.length == 1 && split[0].length() == length) {
				continue;
			}
			int numble = split.length - 1 == 0 ? 1 : split.length - 1;
			count.put(i, numble);
		}
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		scanner.close();
	}
}
