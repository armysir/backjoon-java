package 브루트포스.블랙잭;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        int max = 0;
        int arr[]=new int[101] ;
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        for ( int i =0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<n;i++)
        {
            for(int j = 0; j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(max<arr[i]+arr[j]+arr[k]&&m>=arr[i]+arr[j]+arr[k]&&i!=j&&j!=k&&i!=k)
                    {
                        max = arr[i]+arr[j]+arr[k];
                        
                        
                    }
                }
                

            }
        }
        System.out.println(max);
        
    }
    
}
