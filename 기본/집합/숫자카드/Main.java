package 기본.집합.숫자카드;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n =sc.nextInt();
    
    int[] arr = new int[n];
   
    HashMap<Integer,Integer> map1 = new HashMap<>();
    for(int i= 0; i<n; i++ )
    {
        arr[i]=sc.nextInt();
        map1.put(arr[i], 1);
    }
     
    int num=sc.nextInt();
    int[] arr2 = new int[num];
    for(int i= 0; i<num; i++ )
    {
        arr2[i]=sc.nextInt();
    }
    for(int k :arr2)
    {
        if(map1.containsKey(k))
        {
           sb.append(1+" "); 
        }
        else
        sb.append(0+" "); 
    }
    System.out.println(sb);


   
   }   
}