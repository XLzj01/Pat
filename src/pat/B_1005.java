package pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B_1005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int L = input.nextInt();
		int H = input.nextInt();

		List<Stu> stuList = new ArrayList<Stu>();

		for (int i = 0; i < N; i++) {
			Stu s = new Stu();
			s.setId(input.next());
			s.setDeScore(input.nextInt());
			s.setCaiScore(input.nextInt());
			stuList.add(s);
		}

		List<Stu> list1 = new ArrayList<Stu>();
		List<Stu> list2 = new ArrayList<Stu>();
		List<Stu> list3 = new ArrayList<Stu>();
		List<Stu> list4 = new ArrayList<Stu>();

		for (int i = 0; i < N; i++) {

			int y = stuList.get(i).getDeScore();
			int z = stuList.get(i).getCaiScore();

			if (y >= L && z >= L) {

				if (y >= H && z >= H) {
					list1.add(stuList.get(i));
				} else if (y >= H && z < H) {
					list2.add(stuList.get(i));
				} else if (y < H && z < H && y >= z) {
					list3.add(stuList.get(i));
				} else {
					list4.add(stuList.get(i));
				}

			}

		}
		Collections.sort(list1, new MyComparator());
		Collections.sort(list2, new MyComparator());
		Collections.sort(list3, new MyComparator());
		Collections.sort(list4, new MyComparator());

		System.out.println(list1.size() + list2.size() + list3.size() + list4.size());
		for (Stu s : list1) {
			System.out.println(s.toString());
		}
		for (Stu s : list2) {
			System.out.println(s.toString());
		}
		for (Stu s : list3) {
			System.out.println(s.toString());
		}
		for (Stu s : list4) {
			System.out.println(s.toString());
		}

	}

}

class MyComparator implements Comparator {
	// 重写compare方法，使其从大到小排序
	// 原compare方法 return (x<y)?-1:((x==y)?0:1)
	public int compare(Object o1, Object o2) {
		Stu s1 = (Stu) o1;
		Stu s2 = (Stu) o2;
		if ((s1.getDeScore() + s1.getCaiScore()) != (s2.getDeScore() + s2.getCaiScore())) {
			return (s2.getDeScore() + s2.getCaiScore()) - (s1.getDeScore() + s1.getCaiScore());
		} else if (s1.getDeScore() != s2.getDeScore()) {
			return s2.getDeScore() - s1.getDeScore();
		} else {
			return s1.getId().compareTo(s2.getId());
		}
	}

}

class Stu {
	private String id;
	private int deScore;
	private int caiScore;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDeScore() {
		return deScore;
	}

	public void setDeScore(int deScore) {
		this.deScore = deScore;
	}

	public int getCaiScore() {
		return caiScore;
	}

	public void setCaiScore(int caiScore) {
		this.caiScore = caiScore;
	}

	public String toString() {
		return id + " " + deScore + " " + caiScore;
	}
}
