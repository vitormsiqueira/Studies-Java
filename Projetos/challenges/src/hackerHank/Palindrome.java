package hackerHank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
                
        for (int i = 0; i < A.length(); i++) {
            
        	String left = A.substring(i,i+1);
        	String right = A.substring(A.length()-i-1,A.length()-i);
            
            System.out.println(left);
            System.out.println(right);
                        
            if(!left.equals(right)){
                System.out.println("No");
                break;
            } else {
                if((int)A.length()/2 <= i){
                    System.out.println("Sim");
                    break;
                }
            }
                 
        }
        
    }
}
