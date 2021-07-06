/*
 Curtesian product 
 */
package rezoansirlab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class LabMenual2excercise2 {
    public static void main(String [] args )
    {
        int n,m;
        Vector a=new Vector ();
        Vector b=new Vector ();
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of A:");
        n= ob.nextInt ();
        System.out.println("Enter element :");
        for (int i=0;i<n;i++)
        {
        a.add(ob.nextInt());
        }
        ArrayList <Integer> A=new ArrayList<>(a);
        System.out.println("enter size of B:");
        m= ob.nextInt ();
        System.out.println("Enter element :");
        for (int i=0;i<m;i++)
        {
        b.add(ob.nextInt());
        }
        ArrayList <Integer> B=new ArrayList<>(b);
        System.out.println("AXB=");
        for (int i=0;i<a.size();i++)
        {
         for (int j=0;j<b.size();j++)
         {
             System.out.print("("+a.get(i)+","+b.get(j)+")");
         }
        }
    }
}
