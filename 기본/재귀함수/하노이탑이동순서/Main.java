package 기본.재귀함수.하노이탑이동순서;

import java.util.*;

/**
 * Main
 */
public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append((int)Math.pow(2, n)-1).append('\n');
        hanoi(n,1,2,3);
        System.out.println(sb);

    }
    public static void hanoi(int N,int first,int mid,int finish) 
    {
     if(N==1)
     {
        sb.append(first+" "+finish+'\n');
        return;
     }
     hanoi(N-1, first, finish, mid);

     sb.append(first+" "+finish+'\n');

     hanoi(N-1, mid, first, finish);
        
    }
}