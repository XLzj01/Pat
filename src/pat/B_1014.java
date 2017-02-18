package pat;

import java.math.BigDecimal;
import java.util.Scanner;

public class B_1014 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] split = scanner.nextLine().split("E");
		StringBuffer base = new StringBuffer(split[0]);
		String index = split[1];
		int length = base.length();
		int indexOf = base.indexOf(".");
		int intValue = new BigDecimal(index).abs().intValue();
		base.deleteCharAt(indexOf);
		if (index.startsWith("+")) {
			if (intValue < (length - (indexOf + 1))) {
				base.insert(intValue + indexOf, ".");
			} else {
				for (int i = 0; i < intValue - (length - (indexOf + 1)); i++) {
					base.append("0");
				}
			}
		} else {
			if (intValue >= 1) {
				for (int i = 0; i < intValue - 1; i++) {
					base.insert(1, "0");
				}
				base.insert(1, ".").insert(1, "0");
			}
		}
		base = base.charAt(0) == '+' ? base.deleteCharAt(0) : base;
		System.out.println(base);
		scanner.close();
	}
}
