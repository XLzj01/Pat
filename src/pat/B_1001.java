package pat;

import java.lang.reflect.Array;
import java.util.*;

public class B_1001 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		B_1001 b_1001 = new B_1001();
		int number = b_1001.getSimpleNumber();
		Map<Integer, String[]> arrays = b_1001.getArray(number);
		b_1001.compare(arrays);
	}

	public int getSimpleNumber() throws Exception {
		int number = 0;
		try {
			System.out.println("input test simple number");
			number = scanner.nextInt();
		} catch (Exception e) {
			scanner.close();
			throw new Exception("have a error when you input number");
		}
		System.out.println("the number is " + number);
		System.out.println("yes/no");
		String answer = scanner.next();
		if ("yes".equalsIgnoreCase(answer)) {
			// do nothing
		} else if ("no".equalsIgnoreCase(answer)) {
			number = getSimpleNumber();
		} else {
			System.out.println("please input  yes/no");
			number = getSimpleNumber();
		}
		return number;
	}

	// need to consider Exception.
	public Map<Integer, String[]> getArray(int number) {
		Map<Integer, String[]> arrays = new HashMap<Integer, String[]>();

		int temp = 0;
		scanner.nextLine();
		while (number > temp) {
//			List<String> arrayList = new ArrayList<String>();
			temp++;
			System.out.println("input number array   #" + (temp));
			String tempString = scanner.nextLine();
			String[] tempArray = tempString.split("\\ ");
			// function one
			// Collections.addAll(arrayList, tempArray);
			// System.out.println(arrayList);
			// function two
			// arrayList = (List<String>) Arrays.asList(tempArray);
			// System.out.println(arrayList);

			arrays.put(temp, tempArray);
		}
		return arrays;
	}

	public void compare(Map<Integer, String[]> arrays) {
		int size = arrays.size();
		int i = 0;
		while (size > i) {
			i++;
			String[] array = arrays.get(i);
			int a=new Integer(array[0]);
			int b=new Integer(array[1]);
			int c=new Integer(array[2]);
			if ((a+b) > c) {
				System.out.println("Case #"+i+": ture");
			} else {
				System.out.println("Case #"+i+": false");
			}
		}
	}
}
