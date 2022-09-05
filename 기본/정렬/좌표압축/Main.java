package 기본.정렬.좌표압축;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int [] origin = new int[n];
       int [] sorted = new int[n];
       HashMap<Integer,Integer> rankingMap = new HashMap<Integer,Integer>();

       for(int i = 0; i <n; i++)
       {
        sorted[i] = origin[i] = sc.nextInt();
       }
       Arrays.sort(sorted);

       int rank = 0;

       for (int i:sorted)
       {
        if(!rankingMap.containsKey(i))
        {
            rankingMap.put(i,rank);
            rank++;
        }
       }
       StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

    }
    
}
