package hackerHank;

import java.util.Scanner;

public class Tokens {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
                
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        s = s.trim().replaceAll("\\s{2,}", " ");
        s = s.replaceAll(" ", "\n");
        
        System.out.println("espaco");
        System.out.println(s);
        
        int words = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
			if(!Character.isLetter(s.charAt(i))) {
				words++;
			}
		}
       
        words = (s.length() == 0) ? 0 : words+1;
//
        System.out.println(words);
        System.out.println(s);
        		
	}	
}
