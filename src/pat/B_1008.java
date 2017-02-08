package pat;

import java.util.Scanner;

public class B_1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] oneArrayC = { 0, 0, 0 };
		int[] oneArrayJ = { 0, 0, 0 };
		int[] oneArrayB = { 0, 0, 0 };
		for (int i = 0; i < a; i++) {
			String one = sc.next();
			String two = sc.next();
			if (one.equalsIgnoreCase("C") && two.equalsIgnoreCase("C")) {
				oneArrayC[1] = oneArrayC[1] + 1;
			}
			if (one.equalsIgnoreCase("C") && two.equalsIgnoreCase("J")) {
				oneArrayC[0] = oneArrayC[0] + 1;
			}
			if (one.equalsIgnoreCase("C") && two.equalsIgnoreCase("B")) {
				oneArrayC[2] = oneArrayC[2] + 1;
			}
			if (one.equalsIgnoreCase("J") && two.equalsIgnoreCase("C")) {
				oneArrayJ[2] = oneArrayJ[2] + 1;
			}
			if (one.equalsIgnoreCase("J") && two.equalsIgnoreCase("J")) {
				oneArrayJ[1] = oneArrayJ[1] + 1;
			}
			if (one.equalsIgnoreCase("J") && two.equalsIgnoreCase("B")) {
				oneArrayJ[0] = oneArrayJ[0] + 1;
			}
			if (one.equalsIgnoreCase("B") && two.equalsIgnoreCase("C")) {
				oneArrayB[0] = oneArrayB[0] + 1;
			}
			if (one.equalsIgnoreCase("B") && two.equalsIgnoreCase("J")) {
				oneArrayB[2] = oneArrayB[2] + 1;
			}
			if (one.equalsIgnoreCase("B") && two.equalsIgnoreCase("B")) {
				oneArrayB[1] = oneArrayB[1] + 1;
			}
		}

		System.out.print(oneArrayC[0] + oneArrayJ[0] + oneArrayB[0] + " ");
		System.out.print(oneArrayC[1] + oneArrayJ[1] + oneArrayB[1] + " ");
		System.out.println(oneArrayC[2] + oneArrayJ[2] + oneArrayB[2]);

		System.out.print(oneArrayC[2] + oneArrayJ[2] + oneArrayB[2] + " ");
		System.out.print(oneArrayC[1] + oneArrayJ[1] + oneArrayB[1] + " ");
		System.out.println(oneArrayC[0] + oneArrayJ[0] + oneArrayB[0]);

		StringBuffer sb = new StringBuffer();
		if (oneArrayB[0] >= oneArrayC[0]) {
			if (oneArrayB[0] >= oneArrayJ[0]) {
				sb.append("B ");
			} else {
				sb.append("J ");
			}
		} else {
			if (oneArrayC[0] >= oneArrayJ[0]) {
				sb.append("C ");
			} else {
				sb.append("J ");
			}
		}
		
		if (oneArrayB[2] >= oneArrayC[2]) {
			if (oneArrayB[2] >= oneArrayJ[2]) {
				sb.append("J");
			} else {
				sb.append("C");
			}
		} else {
			if (oneArrayC[2] >= oneArrayJ[2]) {
				sb.append("B");
			} else {
				sb.append("C");
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
