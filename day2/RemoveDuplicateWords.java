package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";

//c) Split the String into array and iterate over it 
		String[] text1 = text.split(" ");
		for (int j = 0; j < text1.length; j++) {
			System.out.println(text1[j]);}

// d) Initialize another loop to check whether the word is there in the array

			Set<String> original = new HashSet<String>();
			for (int i = 0; i < text1.length; i++) {
				original.add(text1[i]);
			}
				System.out.println(original);

			}
		}
	

