package 스택.괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i= 0; i<n ; i++)
        {Stack<Integer> stack = new Stack<Integer>();
            int on=0;
            String str = sc.next();
            for(int j=0; j<str.length();j++)
            {
                
                char s = str.charAt(j);
                if(s=='(')
                {
                    stack.push(1);
                }
                else if(stack.empty())
                {
                    System.out.println("NO");
                    on=1;
                    break;

                }
                else
                {
                    stack.pop();
                }
            }
            if(on==0){
                if(stack.empty())
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
    
}
