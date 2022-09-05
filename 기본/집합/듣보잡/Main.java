package 기본.집합.듣보잡;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int cnt = 0;
        sc.nextLine();
        String[] arr = new    String[num1];
        String[] arr1 = new   String[num2];
       ArrayList<String> str = new ArrayList<>();

        for(int i = 0 ; i<num1; i++)
        {
            arr[i]=sc.nextLine();
            map.put(arr[i], 1);
        }
        for(int i = 0 ; i<num2; i++)
        {
            arr1[i]=sc.nextLine();

        }
        for(String k:arr1)
        {
            if(map.containsKey(k))
            {   
               str.add(k);
               cnt++;
            }
        }
        Collections.sort(str);
        for(String k:str)
        {
            sb.append(k+" "+"\n");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
    
}
