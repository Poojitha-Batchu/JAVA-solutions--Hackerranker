import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
       String n1=s.next();
       String n2=s.next() ;
       BigInteger b1= new BigInteger(n1);
       BigInteger b2= new BigInteger(n2);
       System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
