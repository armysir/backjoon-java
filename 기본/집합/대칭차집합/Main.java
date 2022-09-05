package 기본.집합.대칭차집합;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[num1];
        int[] arr1 = new int[num2];
        for(int i = 0 ; i<num1; i++)
        {
            arr[i]=sc.nextInt();
            map.put(arr[i], 1);
        }
        for(int i = 0 ; i<num2; i++)
        {
            arr1[i]=sc.nextInt();

        }
        for(int k:arr1)
        {
            if(map.containsKey(k))
            {
                cnt++;
            }
        }
        System.out.println((num1-cnt)+(num2-cnt));

    }
    
}
