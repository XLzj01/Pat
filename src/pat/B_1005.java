package pat;

import java.util.LinkedList;
import java.util.Scanner;

public class B_1005 {
	public static LinkedList<Integer[]> DandCandA = new LinkedList<Integer[]>();
	public static LinkedList<Integer[]> DbigCandH = new LinkedList<Integer[]>();
	public static LinkedList<Integer[]> DbigC = new LinkedList<Integer[]>();
	public static LinkedList<Integer[]> DandCL = new LinkedList<Integer[]>();

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String infoString = scanner.nextLine();

		String[] infoArry = infoString.split("\\ ");
		Integer numble = new Integer(infoArry[0]);
		Integer L = new Integer(infoArry[1]);
		Integer H = new Integer(infoArry[2]);

		for (int i = 0; i < numble; i++) {
			String humen = scanner.nextLine();
			String[] humenInfo = infoString.split("\\ ");
			Integer id = new Integer(humenInfo[0]);
			Integer D = new Integer(humenInfo[1]);
			Integer C = new Integer(humenInfo[2]);
			Integer Total = D + C;
			if (D > H && C > H) {
				insert(DandCandA, Total, D, id);
			} else if (D > H && L < C && C < H) {

			} else if (L < C && L < D) {
				if (D > C) {

				} else {
				}
			}
		}
	}

	private static Integer[] insert(LinkedList<Integer[]> linkedList, Integer Total, Integer D, Integer id) {
		Integer array[] = new Integer[3];
		array[0] = Total;
		array[1] = D;
		array[2] = id;
		if (linkedList.size() > 0) {
			
		} else {
			linkedList.add(array);
		}
		return null;
	}

	private static Integer[] sort(LinkedList<Integer[]> linkedList, Integer array[], int a) {
		for (int i = 0; linkedList.size() > i; i++) {
			if (linkedList.get(i)[a] < array[a]) {

			} else if (linkedList.get(i)[a] > array[a]) {
				linkedList.add(i, array);
			} else {
				int b = a + 1;
				sort(linkedList, array, b);
			}
		}

		return null;
	}
}