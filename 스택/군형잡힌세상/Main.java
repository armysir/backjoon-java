package 스택.군형잡힌세상;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
           
                String str =sc.nextLine();
                if(str.equals("."))
                {
                    System.exit(0);
                }
                System.out.println(solve(str));

            

        }

    
    
    }


    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();
   
        
        for(int i = 0 ; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='('||c=='[')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                if(stack.empty()||stack.peek()!='(')
                {
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            else if(c==']')
            {
                if(stack.empty()||stack.peek()!='[')
                {
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
           
            
        }
        if(stack.empty())
        {
            return "yes";
        }
        else{
            return "no";
        }
        
        
    }
    
}
