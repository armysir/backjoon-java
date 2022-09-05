package 기본.집합.문자열집합;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        String[] str1 = new String[num1];
        String[] str2 = new String[num2];
        HashMap<String,Integer> map = new HashMap<>();
        for( int i =0 ; i<num1; i++)
        {
            str1[i]=sc.nextLine();
            map.put(str1[i], 1);
        }  
        for( int i =0 ; i<num2; i++)
        {
            str2[i]=sc.nextLine();   
        }
        for(String k: str2)
        {
            if(map.containsKey(k))
            {
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}
