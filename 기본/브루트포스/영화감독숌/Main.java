package 기본.브루트포스.영화감독숌;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int Numcnt = 0;
        

        int start =665;
        for (int i = start; i<17000000; i++)
        {
            int cnt = 0;
            int cnt1 = 0;
            
            int temp = i;
            int num ;
            while(temp>0)
            {
                num=temp%10;
                if(num == 6)
                {
                    cnt++;
                }
                else
                {
                    cnt = 0;
                }
                temp =temp/10;
                if(cnt==3)
                {
                    Numcnt++;
                    if(n==Numcnt)
                    {
                        System.out.println(i);
                    }
                    break;
                }
            
            }
        }
       
        
        
        }
    }
    

