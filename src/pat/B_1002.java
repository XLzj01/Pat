package pat;

import java.math.BigDecimal;
import java.util.Scanner;

public class B_1002 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int temp = 0;
		int a[] = { 0, 0, 0, 0, 0 };
		boolean falg[] = { false, false, false, false, false };
		for (int j = 0; j < input; j++) {
			int numble = scanner.nextInt();
			if (numble % 5 == 0 && numble % 2 == 0) {
				a[0] = a[0] + numble;
				falg[0] = true;
			}
			if (numble % 5 == 1) {
				a[1] = a[1] + numble;
				a[1] = -a[1];
				falg[1] = true;
			}
			if (numble % 5 == 2) {
				a[2]++;
				falg[2] = true;
			}
			if (numble % 5 == 3) {
				a[3] = a[3] + numble;
				falg[3] = true;
				temp++;
			}
			if (numble % 5 == 4) {
				if (a[4] < numble) {
					a[4] = numble;
					falg[4] = true;
				}
			}
		}
		a[1] = -a[1];
		for (int i = 0; i < falg.length; i++) {
			if (falg[i]) {
				if (i == 3) {
					double numble = a[i];
					double temp2 = temp;
					//....
					System.out.print((new BigDecimal(numble / temp2)).setScale(1, BigDecimal.ROUND_HALF_UP) + " ");
				} else {
					System.out.print(a[i] + " ");
				}
			} else {
				System.out.print("N ");
			}
		}
	}
}
