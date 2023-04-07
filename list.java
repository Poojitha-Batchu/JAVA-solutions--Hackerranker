import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> obj= new ArrayList<Integer>();
        int size=s.nextInt();
        for(int i=0; i<size; i++){
            int value=s.nextInt();
            obj.add(value);
        }
        int queries=s.nextInt();
        for(int i=0; i<queries; i++){
            String operation=s.next();
            if (operation.equals("Insert")){
                int index=s.nextInt();
                int value=s.nextInt();
                obj.add(index,value);
            }else if(operation.equals("Delete")) {
                int index=s.nextInt();
                obj.remove(index);
            }
        }
        for(int i=0; i<obj.size(); i++){
            int value=obj.get(i);
            System.out.print(value+" ");
        }
    }
}
