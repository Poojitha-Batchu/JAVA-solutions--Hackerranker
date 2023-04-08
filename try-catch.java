import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        
        try{
            int n1=s.nextInt();
            int n2=s.nextInt();
            System.out.println(n1/n2);
        }catch(ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if (e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        }
    
    }
   
}
