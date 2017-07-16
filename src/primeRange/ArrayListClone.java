package primeRange;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(new Integer(1));
		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
		list2.add(new Integer(2));
		System.out.println(list1);
		System.out.println(list2);
	}

}
