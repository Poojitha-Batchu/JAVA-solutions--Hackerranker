import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
           if(balance(input)){
               System.out.println("true");
           } else {
               System.out.println("false");
           }
            
		}	
	}
    
    public static boolean balance(String s){
        Stack<Character> stack= new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            } else if(s.charAt(i)=='{'){
                stack.push('{');
            } else if(s.charAt(i)=='['){
                stack.push('[');
            } else if (s.charAt(i)==')'){
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') return false;
            } else if (s.charAt(i)=='}'){
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{') return false;
            } else if (s.charAt(i)==']'){
                if(stack.isEmpty()) return false;
                if(stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}



