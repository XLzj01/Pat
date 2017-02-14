package pat;

import java.util.Scanner;

public class B_1012 {
	static Long nLong = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		String[] split = nextLine.split("\\ ");
		Long decimalOne = new Long(split[0]) + new Long(split[1]);
		nLong = new Long(split[2]);
		StringBuffer sb = new StringBuffer();
		sb = getNumble(decimalOne, sb);
		System.out.println(sb);
		scanner.close();
	}

	public static StringBuffer getNumble(Long numble, StringBuffer sb) {
		long temp = numble / nLong;
		Long remainder = numble % nLong;
		if (temp > 0) {
			sb.insert(0, remainder);
			sb = getNumble(temp, sb);
		} else {
			sb.insert(0, remainder);
		}
		return sb;
	}
}
