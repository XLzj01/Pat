package pat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class B_1010 {

	public static double money = 0;
	public static int request;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] charArray = scanner.nextLine().split("\\ ");
		int species = new Integer(charArray[0]);
		request = new Integer(charArray[1]);
		int[] stocks = new int[species];
		ArrayList<moonCake> moonCakes = new ArrayList<moonCake>();
		for (int i = 0; i < species; i++) {
			stocks[i] = scanner.nextInt();
		}
		for (int temp : stocks) {
			BigDecimal stock = new BigDecimal(temp).setScale(2, BigDecimal.ROUND_DOWN);
			BigDecimal totlaPrice = new BigDecimal(scanner.nextInt()).setScale(2, BigDecimal.ROUND_DOWN);
			BigDecimal unitPrice = totlaPrice.divide(stock, 2, BigDecimal.ROUND_HALF_DOWN);
			moonCakes.add(new moonCake(stock, totlaPrice, unitPrice));
		}
		Collections.sort(moonCakes, new B_1010Comparator());
		// System.out.println(moonCakes);
		for (moonCake moonCake : moonCakes) {
			getRequest(moonCake);
			if (request <= 0) {
				break;
			}
		}
		System.out.println(new BigDecimal(money).setScale(2, BigDecimal.ROUND_DOWN));
		scanner.close();
	}

	public static int getRequest(moonCake moonCake) {
		int stock = moonCake.stock.intValue();
		if (request >= stock) {
			money = money + moonCake.totlaPrice.doubleValue();
		} else if (request < stock) {
			money = request * moonCake.unitPrice.doubleValue() + money;
		}
		request = request - stock;
		return request;
	}
}

class moonCake {
	BigDecimal stock;
	BigDecimal totlaPrice;
	BigDecimal unitPrice;

	public moonCake(BigDecimal stock, BigDecimal totlaPrice, BigDecimal unitPrice) {
		this.stock = stock;
		this.totlaPrice = totlaPrice;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "moonCake [stock=" + stock + ", totlaPrice=" + totlaPrice + ", unitPrice=" + unitPrice + "]";
	}
}

class B_1010Comparator implements Comparator {
	public int compare(Object o1, Object o2) {
		moonCake s1 = (moonCake) o1;
		moonCake s2 = (moonCake) o2;

		if ((s1.unitPrice.doubleValue() - s2.unitPrice.doubleValue()) >= 0) {
			return -1;
		} else {
			return 1;
		}
	}
}
