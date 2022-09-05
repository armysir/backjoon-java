package 정렬.소트인사이드;

import java.util.*;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        String str = sc.nextLine();
        for (int i = 0 ; i<str.length(); i ++)
        {
            char a = str.charAt(i);
            list.add(a);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i = 0 ; i<str.length(); i++)
        {
            System.out.printf("%c",list.get(i));
        }
        


        
    }
}
