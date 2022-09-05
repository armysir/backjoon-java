package 기본.정렬.통계학;
import java.beans.BeanProperty;
import java.util.*;


public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb= new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
		double a=0;
        int b;
        int c=0;
        int d;
        int cnt = 0;
        int max = 0;
        int maxnum=0;
        int secnum = 0;
        boolean bool=false;
        int[] arr = new int[8001];
        int[] arr1 = new int[1];
		for(int i = 0; i < n; i++) 
        {
			list.add(sc.nextInt());
            a = a + list.get(i);
            arr[list.get(i)+4000]++;
            
		}
        Collections.sort(list);
        for(int i = 0; i<8001; i++)
        {
            if(arr[i]>max)
            {
                max= arr[i];
                maxnum = i;
                bool=true;
            }
            else if(arr[i]==max&& bool== true)
            {
             secnum=maxnum;
             maxnum = i;
             bool = false;
            }
        }
    //   if(secnum!=0)
    //   {
    //     maxnum=secnum;
    //   }
            

        
        a=a/n;
        b= list.get(n/2);
        c=maxnum-4000;
        d= list.get(n-1)-list.get(0);
          System.out.println((int)Math.round((double)a));
          System.out.printf("%d\n%d\n%d\n",b,c,d);
          

        

    }
    
}

