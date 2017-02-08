package pat;

import java.util.Scanner;

public class B_1004 {
	public static void main(String[] args) throws Exception {
		StringBuffer rightDay = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[4];
		String[] days = { "MON ", "TUE ", "WED ", "THU ", "FRI ", "SAT ", "SUN " };
		int[] hours = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, };
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
			if (65 <= dayCharArrayNumble && 71 >= dayCharArrayNumble && count == 1
					&& i == dayString.indexOf(subtitle.toString())) {
				rightDay.append(days[dayCharArrayNumble - 65]);
				count++;
			} else if (count == 2 && i == dayString.indexOf(subtitle.toString())) {
				if (48 <= dayCharArrayNumble && 57 >= dayCharArrayNumble) {
					rightDay.append(hours[dayCharArrayNumble - 48]).append(":");
				} else if (65 <= dayCharArrayNumble && 78 >= dayCharArrayNumble) {
					rightDay.append(hours[dayCharArrayNumble - 65 + 10]).append(":");
				}
			}
		}
		char[] timeCharArray = strings[2].toCharArray();
		for (int i = 0; i < timeCharArray.length; i++) {
			Character subtitle = timeCharArray[i];
			int dayCharArrayNumble = subtitle;
			if (97 <= dayCharArrayNumble && 122 >= dayCharArrayNumble && i == strings[3].indexOf(subtitle.toString())) {
				if (i < 10) {
					rightDay.append(0).append(i);
				} else {
					rightDay.append(i);
				}
			}
		}
		System.out.println(rightDay.toString());
		
		scanner.close();
	}
}