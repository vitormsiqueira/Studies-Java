package hackerHank;
import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        
        int maxDigit = in.nextInt();
        maxDigit = (maxDigit > 9) ? 9 : maxDigit;
        int maxVal = 21;
        int sum = 0;
        
        int[] val = new int[4];
        int r;
        
        if(maxDigit > 1){
            for (int a = 0; a <= maxDigit; a++) {
                for (int b = 0; b <= maxDigit; b++) {
                    for (int c = 0; c <= maxDigit; c++) {
                        for (int d = 0; d <= maxDigit; d++) {
                            sum = a + b + c + d;
                            
                            if(sum == maxVal){
                                System.out.printf("%d%d%d%d\n", a, b, c, d);
                            }
                        }
                    }
                }
                
            }
        } else {
            System.out.println("null");
        }
        
        System.out.println("Fim");
                
    }

}
