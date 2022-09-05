package 기본.브루트포스.체스판다시칠하기;

import java.util.Scanner;

public class Main {
    public static boolean arr[][];
    public static int min;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        arr = new boolean[n][m];
        for (int i = 0 ; i<n; i++)
        {
            String str = sc.next();
            for(int j = 0 ; j<m; j++)
            {
                if(str.charAt(j)=='W')
                {
                    arr[i][j]=true;

                }
                else
                {
                    arr[i][j]=false;

                }
                
            }
        }
        

    }
    
}
