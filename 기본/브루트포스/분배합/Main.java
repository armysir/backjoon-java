package 기본.브루트포스.분배합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<n;i++)
        {
            
            int temp=i;
            int num=i;
            while(temp>0)
            {
                num = num+ temp%10;
                temp = temp /10;
            }
            if(num==n)
            {
                cnt ++;
                System.out.println(i);
                break;

            }
            
        }
        if(cnt == 0 )
        {
            System.out.println(0);
        }
    }
}