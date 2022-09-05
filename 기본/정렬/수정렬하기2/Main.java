package 정렬.수정렬하기2;


import java.util.*;

public class Main {
    public static int arr[];
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr= new int[n];
        int cnt = 0;
        
        for(int i =0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        while(cnt!=n)
        {
            for(int i=1; i<n;i++)
            {
                if(arr[i]<arr[i-1])
                {
                    int num;
                    num =arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=num;
                    
                }
            }
            cnt++;
        }
        for(int val : arr)
        {
            sb.append(val).append('\n');
        }
        System.out.println(sb);    

    }
    
}