import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger n= s.nextBigInteger();
        System.out.println(n.isProbablePrime(1)?"prime":"not prime");
    }
    
}
