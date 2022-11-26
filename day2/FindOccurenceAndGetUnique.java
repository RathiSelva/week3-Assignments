package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurenceAndGetUnique {

	public static void main(String[] args) {
		int[] arrayNo = { 1, 2, 1, 3, 2, 5 };

		Map<Integer, Integer> fOcc = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrayNo.length; i++) {
			if (fOcc.containsKey(arrayNo[i])) {
				Integer occ = fOcc.get(arrayNo[i]);
				fOcc.put(arrayNo[i], occ + 1);
			}

			else {
				fOcc.put(arrayNo[i], 1);
			}
		}
		System.out.println(fOcc);

		Set<Entry<Integer, Integer>> entry = fOcc.entrySet();
		for (Entry<Integer, Integer> entry2 : entry) {
			Integer value = entry2.getValue();
			if (value == 1)
				
			System.out.println(entry2.getKey()+"= "+entry2.getValue());
		}

	}
}
