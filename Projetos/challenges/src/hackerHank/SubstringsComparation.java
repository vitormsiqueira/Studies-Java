package hackerHank;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SubstringsComparation {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
//        
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//        // 'largest' must be the lexicographically largest substring of length 'k'
//        
        String sub[] = new String[s.length()-k+1];
//
		for (int i = 0; i < s.length()-k+1; i++) {
	        sub[i] = s.substring(i, i+k);
	    }

		System.out.println(Arrays.toString(sub));
		
		String temp;
		
		for (int i = 0; i < sub.length-1; i++) {
			for (int j = i+1; j < sub.length; j++) {
				if(sub[i].compareTo(sub[j]) > 0) {
					System.out.println("Sim");
					temp = sub[i];
					sub[i] = sub[j];
					sub[j] = temp;
					System.out.println(Arrays.toString(sub));
				}
				System.out.println("Não");
			}
			System.out.println("Array ao final da uma iteração");
			System.out.println(Arrays.toString(sub));
		}
		
		System.out.println("Array Final");
		System.out.println(Arrays.toString(sub));
		
		smallest = sub[0];
		largest = sub[sub.length-1];
		
//        return (""+sub+"");
        return smallest + "\n" + largest; 
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
	
}
