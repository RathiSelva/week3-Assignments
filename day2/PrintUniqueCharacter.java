package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "babu";
		char[] charArray = name.toCharArray();

		Set<Character> unique = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = unique.add(charArray[i]);
			if (!add) {
				unique.contains(charArray[i]);
				unique.remove(charArray[i]);
			}

			else {

				unique.add(charArray[i]);
			}
		}
		System.out.println(unique);

	}

}
