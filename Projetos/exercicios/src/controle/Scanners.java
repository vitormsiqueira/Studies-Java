package controle;
import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) {
		
//		System.out.println(3%2);
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.printf("Type a string: ");
//		String myString = scanner.next();
//
//		System.out.printf("Type a number: ");
//		int myInt = scanner.nextInt();
//		
//		scanner.close();
//
//		System.out.println("myString is: " + myString);
//		System.out.println("myInt is: " + myInt);
		
		
//		Scanner scan = new Scanner(System.in);
//        
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = "";
//        s += scan.nextLine();        
//        
//        scan.close();
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
        
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        System.out.println(in.hasNext());
        
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            String result = "";
            int calculo = 0;
            
            for (int j = 0; j < n; j++) {
                calculo += (int)Math.pow(2,j) * b;
                
                result += (a + calculo) + " ";
            }
            
            
            System.out.println(result);
        }
        
        in.close();
        
	}
}
