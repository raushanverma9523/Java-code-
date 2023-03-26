import java.util.*;
import java.io.*;


public class Voting {
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int d=0,x=0;
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            if(array[i]>0){
                d=array[i]%10;
                x=x*10+d;
                System.out.println(x);

            }
            
        }
        x%=10;
        if(x==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        
    }
}
