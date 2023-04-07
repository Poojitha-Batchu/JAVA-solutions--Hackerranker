import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       
        // Write your code here.
        StringTokenizer s= new StringTokenizer(str, " !,?._'@");
        int count=s.countTokens();
        System.out.println(count);
        while(s.hasMoreTokens()){
            System.out.println(s.nextElement());
        }
    }
}

