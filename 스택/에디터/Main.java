package 스택.에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringBuilder sb =new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = br.readLine();
        for(int i=0; i<str.length();i++)
        {
            left.push(str.charAt(i));
        }
        int n =Integer.parseInt(br.readLine());
        while(n-->0)
        {
            // String value =br.();
            st=new StringTokenizer(br.readLine());
            String value=st.nextToken();

                if(value.equals("L")){
                    if(!left.empty()){
                        right.push(left.peek());
                        left.pop();
        
                    }
                }

                
                if(value.equals("D"))
                {
                    if(!right.empty()){
                        left.push(right.peek());
                        right.pop();
                    }
                }



                if(value.equals("B")&&!left.empty()){ 
                    
                    left.pop();
                }



                if(value.equals("P")){

                    left.push(st.nextToken().charAt(0));
                }
                


            
        }
        while(!left.empty())
        {
            right.push(left.pop());
        }
        
        while(!right.empty())
        {
            sb.append(right.pop());
        }

        System.out.println(sb);



    }
    
}
