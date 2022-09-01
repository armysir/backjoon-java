package 정렬.나이순정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0 ; i <n; i++)
        {
            list.add(sc.nextInt());
            name.add(sc.nextLine());
        }
        
    }
}
