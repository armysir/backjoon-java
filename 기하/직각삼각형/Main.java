package 기하.직각삼각형;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while(true)
        {
            int max=0;
            int maxcnt=0;
            int[] arr = new int[3];
            for(int i = 0 ; i <3;i++)
            {
                arr[i]=sc.nextInt();
            }
            if(arr[0]==0&&arr[1]==0&&arr[2]==0)
            {
                System.exit(0);
            }
            for(int i = 0 ; i <3;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                    maxcnt=i;
                }
            }
            arr[maxcnt]=0;
            if(max*max==arr[0]*arr[0]+arr[1]*arr[1]+arr[2]*arr[2])
            {
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
            
        
            
            

        }


    }

    
}
