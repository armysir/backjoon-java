package 재귀함수.팩토리얼;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
         
        System.out.println(factorial(n));
        
    }

    public static int factorial(int a) 

    {
 if(a>1)
 {
    return a*factorial(a-1);
 }   
 else
 {
    return 1;
 }

 
}

}