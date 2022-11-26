package week3.day2;
	import java.util.Map;
import java.util.TreeMap;

	
	public class FindNumbersOccurence {
		public static void main(String[] args) {
			int[] arrayNo = { 2,3,5,6,3,2,1,4,2,1,6,-1 };

			Map<Integer, Integer> fOcc = new TreeMap<Integer, Integer>();
			
			for (int i = 0; i < arrayNo.length; i++) {
				fOcc.put(arrayNo[i],fOcc.getOrDefault(arrayNo[i],0)+1);}
			System.out.println(fOcc);	
				
			}
}
