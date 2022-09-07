package 스택.제로;

import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i = 0 ; i<n; i++)
        {
            int k = sc.nextInt();
            if(k==0){
                stack.pop();
            }
            else
            {
                stack.push(k);
            }

        }
        for(int j :stack)
        {
            sum = sum+j;

        }
        System.out.println(sum);

    }
    
}
