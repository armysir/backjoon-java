package 브루트포스.덩치;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int person =sc.nextInt();
        
        int arr[][]= new int[50][2];
       
        for(int i = 0; i <person; i++)
        {
           for(int j = 0; j<2; j++)
           {
            if(j==0)
            {
                arr[i][j]=sc.nextInt();
               
            }
            else
            {
                arr[i][j]=sc.nextInt();
                
            }
           }
        }
        for(int i = 0; i <person; i++)
        {
            int score=0;//돌 떄마다 초기화 
            for(int k = 0; k <person; k++)
            {
                if(arr[i][0]<arr[k][0]&&arr[i][1]<arr[k][1]&&i!=k)//i번 사람이 k번 사람보다 키,몸무게 작은면 카운트
                {                                                 //나보다 큰사람의 수를 의미
                   score++;

                }
               
            }
            System.out.printf("%d ",score+1);//총 나보다 큰 사람의 수+1을 하면 등수가 나옴
        }
    }
    
}
