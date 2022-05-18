package firstChallenges;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    // Desafio 1
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int len = arr.size();        
        double negative = 0;
        double positive = 0;
        double zero = 0;
        

        for (int i = 0; i < len; i++){
            if (arr.get(i) < 0){
                negative++;
            }else if (arr.get(i) > 0){
                positive++;
            }else
                zero++;
        }
        
        System.out.println(positive/len);
        System.out.println(negative/len);
        System.out.println(zero/len);

    }
    
    
    // Desafio 2
    // Given five positive integers, find the minimum and maximum values that can be calculated 
    // by summing exactly four of the five integers. Then print the respective minimum and maximum 
    // values as a single line of two space-separated long integers.
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
            
            // Ordena o array
            Collections.sort(arr);
            
            long minimum = 0;
            long maximum = 0;
            
            for(int i = 0; i < 4; i++){
                minimum += arr.get(i); 
            }
            
            for(int i = 1; i < 5; i++){
                maximum += arr.get(i); 
            }
            System.out.println(minimum +" "+ maximum);

    }
    
    
    // Desafio 3
    // Given a time in 12-hour AM/PM format, convert it to military (24-hour) time. 
    // Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    // - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
    public static String timeConversion(String s) {
        // Write your code here
            DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
            DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
            
            Date date = null;
            String output = null;

            try{
                //Converting the input String to Date
                date= df.parse(s);
                //Changing the format of date and storing it in String
                output = outputformat.format(date);
                //Displaying the date
                return output;
            }catch(ParseException pe){
                pe.printStackTrace();
            }
            
            return output;
    }
    
    
    // Desafio 4
    // Given an array of integers, where all elements but one occur twice, find the unique element.
    // Example: a = [1,2,3,4,3,2,1]
    // The unique element is 4
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        int len = a.size();
        int lonely = 0;
        int it = 0;        
        for (int i = 0; i < len; i++){
            
            for (int j = 0; j < len; j++){
                if (j != i){
                    if (a.get(i) != a.get(j)){
                        lonely = i;
                        it++;
                    } else {
                        j = len;
                    }
                }
            }
            if (it == len - 1){
                break;
            }
            it = 0;
        }
        System.out.println(lonely);
        return a.get(lonely);
    }

    
    // Desafio 5
    // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    // For example, the square matrix arr is shown below:
    
    // 		1 2 3
    // 		4 5 6
    // 		9 8 9
    
    // The left-to-right diagonal = 1 + 5 +9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. 
    // Their absolute difference is |15 - 17| = 2.
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int len = arr.size() ;
        
        int left = 0;
        int right = 0;
        
        for(int i = 0; i < len; i++){
            left += arr.get(i).get(i);
        }
        
        for(int i = len; i > 0; i--){
            right += arr.get(i-1).get(len-i);
        }
        
        System.out.println(left);
        System.out.println(right);
        return Math.abs(left - right);
    }
    
    
    // Desafio 6
    // Countig sort.
    // Example:
    // arr = [1,1,3,2,1]
    // All of the values are in the range , so create an array of zeros, . The results of each iteration follow:
    // i	arr[i]	result
    // 0	1	[0, 1, 0, 0]
    // 1	1	[0, 2, 0, 0]
    // 2	3	[0, 2, 0, 1]
    // 3	2	[0, 2, 1, 1]
    // 4	1	[0, 3, 1, 1]
    
    // The frequency array is [0,3,1,1]. These values can be used to create the sorted array as well: sorted=[1,1,1,2,3].
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        int len = arr.size();
        
        List<Integer> result = new ArrayList<Integer>(100);
        
        for (int i = 0; i < 100; i++) {
            result.add(0);
        }
        
        System.out.println(arr.size());
        System.out.println(result.size());
        // System.out.println(result);
        
        int index = 0;
        int j = 0;
        
        for(int i = 0; i < len; i++){
            index = arr.get(i);
            j = result.get(index);
            // System.out.println(j);
            
            result.set(index, j+1);
        }
        
        System.out.println(result);
        return result;
        
    }
    
    
    // Desafio 7
    // ZiZag Sequence
    // Given an array of  distinct integers, transform the array into a zig zag sequence by permuting the array elements. 
    // A sequence will be called a zig zag sequence if the first  elements in the sequence are in increasing order and the 
    // last  elements are in decreasing order, where . You need to find the lexicographically smallest zig zag sequence of the given array.
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2 - 1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    
    // Desafio 10
    // Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. 
    // Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.
    public static String gridChallenge(List<String> grid) {
        for (int i = 0; i < grid.size(); ++i) {
            char[] s = grid.get(i).toCharArray();
            Arrays.sort(s);
            grid.set(i, new String(s));
        }
                
        for (int i = 0; i < grid.size()-1; i++) {
            for (int j = 0; j < grid.get(i).length(); j++) {
                System.out.println(j);
                if (grid.get(i).charAt(j) > grid.get(i+1).charAt(j)) {
                    return "NO";
                }
            }
        }
        
        return "YES";
    }
    
    
    // 
}



