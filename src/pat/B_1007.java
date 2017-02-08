package pat;

import java.math.BigInteger;
import java.util.Scanner;

public class B_1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		int b = sc.nextInt();
		System.out.println(a.divide(BigInteger.valueOf(b)) + " " + a.mod(BigInteger.valueOf(b)));
		
		sc.close();
	}
}
