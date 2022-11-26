package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitted = text.split(" ");
		Map<String, Integer> ocrens = new HashMap<String, Integer>();
		for (int i = 0; i < splitted.length; i++) {
			if (ocrens.containsKey(splitted[i])) {
				Integer occ = ocrens.get(splitted[i]);
				ocrens.put(splitted[i], occ + 1);
			}

			else {
				ocrens.put(splitted[i], 1);
			}
		}
		System.out.println(ocrens);

		Set<Entry<String, Integer>> entry = ocrens.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			Integer count = entry2.getValue();
			if (count > 1)

				System.out.println(entry2.getKey() + "= " + entry2.getValue());

			if (count > 1) {
				String unique = text.replace("java", "");

				System.out.println(unique);

			}
		}

	}
}
