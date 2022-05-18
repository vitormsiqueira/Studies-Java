package hackerHank;
import java.util.Scanner;


public class Anagram {

    static int countChar(String x, char y) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            count += (x.charAt(i) == y) ? 1 : 0; 
        }
        return count;
    }
    

    static boolean isAnagram(String a, String b) {
        
        int aCount;
        int bCount;
        
        int x = 0;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                                        
                    if(a.charAt(i) == b.charAt(j)) {
                        aCount = countChar(a, a.charAt(i));
                        bCount = countChar(b, b.charAt(j));
                        
                        if(aCount == bCount) {                            
                            x++;
                            break;
                        } else {
                            x = 0;
                        }

                    }
                }
            }
        } else {
            x = 0;
        }
        
        return (x == a.length()) ? true : false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
