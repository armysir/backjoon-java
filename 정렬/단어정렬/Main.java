package 정렬.단어정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        String n[] = new String[num];
        sc.nextLine();

        for(int i = 0 ; i<num ; i++)
        {
            n[i] = sc.nextLine();
        }
        
        Arrays.sort(n, (e1, e2) ->{
            if(((String) e1).length() == ((String) e2).length())
            {
                return e1.compareTo(e2);

            }
            else{
               return ((String) e1).length() - ((String) e2).length();
            }
        });

        for(int i = 1 ; i<num; i++)
        { if(n[i]==n[i-1])
            {
                continue;
            }
            System.out.println(n[i-1]);
        }


    }
    
}
