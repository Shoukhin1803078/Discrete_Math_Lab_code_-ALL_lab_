package rezoansirlab;
import java.util.Scanner;
public class SomantorDhara {
    public static void main(String [] args)
    {int L,U,a,d,n=0;
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter UpperBound:");
    U=ob.nextInt();
    System.out.println("Enter 1st element:");
    a=ob.nextInt();
    System.out.println("Enter general :");
    d=ob.nextInt();
   int array[]=new int[U];
 
   double sum=0;
   
     System.out.println("series:");
    for (int i=a;i<U;i++)
    { 
        array[i]=a+(i-1)*d;
        System.out.print(array[i]+" ");
        sum=sum+array[i];
    }
    System.out.println("\n\nsum is :"+sum);
    }
    
    
}
