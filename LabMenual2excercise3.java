/*
power set 
 */
package rezoansirlab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class LabMenual2excercise3 {
    
    
    public static void function(Vector <Integer>a,ArrayList<Integer>a1,int n)
    {
        
        if (n==0)
        {
            System.out.println(a1);
        }
        a1.
                   
                
    }

    public static void main(String[] args) {
        int n, m;
        Vector a = new Vector();
        Scanner ob = new Scanner(System.in);
        System.out.println("enter size of A:");
        n = ob.nextInt();
        System.out.println("Enter element :");
        for (int i = 0; i < n; i++) {
            a.add(ob.nextInt());
        }
        ArrayList<Integer> a1 = new ArrayList<>(a);
       
       function(a,a1,n);
        
        
    }
}