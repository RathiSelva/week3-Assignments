package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInSet {

	public static void main(String[] args) {
		String companyName = "google";
		char[] array = companyName.toCharArray();

		Set<Character> uniqueChar = new HashSet<Character>();
		for (int i = 0; i < uniqueChar.size(); i--) {
		 uniqueChar.add(array[i]);

			System.out.println(uniqueChar);

		}

	}
}
