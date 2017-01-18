package pat;

import java.util.ArrayList;
import java.util.Scanner;

public class B_1004 {
	public static void main(String[] args) throws Exception {
		StringBuffer rightDay = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[4];

		for (int i = 0; i < strings.length; i++) {
			String temp = scanner.nextLine();
			strings[i] = temp;
		}

		char[] dayCharArray = strings[0].toCharArray();
		String dayString = strings[1];
		int count = 1;

		for (int i = 0; i < dayCharArray.length; i++) {
			Character subtitle = dayCharArray[i];
			int dayCharArrayNumble = subtitle;
			if (65 < dayCharArrayNumble && 90 > dayCharArrayNumble) {
				int indexOf = dayString.indexOf(subtitle.toString());
				Character compareDayString = dayString.charAt(indexOf);
				if (i == indexOf && count == 1 && subtitle == compareDayString) {
					count++;
					switch (subtitle.toString()) {
					case "A":
						rightDay.append("MON ");
						break;
					case "B":
						rightDay.append("TUE ");
						break;
					case "C":
						rightDay.append("WED ");
						break;
					case "D":
						rightDay.append("THU ");
						break;
					case "E":
						rightDay.append("FRI ");
						break;
					case "F":
						rightDay.append("SAT ");
						break;
					case "G":
						rightDay.append("SUN ");
						break;

					}
				}
				if (i == indexOf && count == 1 && subtitle == compareDayString) {
					rightDay.append("SAT ");
					
				}
			}
		}
	}
}