package rezoansirlab;
import  java.util.ArrayList;
import  java.util.Scanner;
import  java.util.Vector;

public class LabMenual2exercise1practice {
       
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        Vector U = new Vector();
        Vector A = new Vector();
        Vector B = new Vector();
        Vector u = new Vector();
        Vector a = new Vector();
        Vector b = new Vector();
        int m, n, o, p, q, r;
        System.out.println("enter size of universal set: ");
        m = ob.nextInt();
        System.out.println("enter element:");
        for (int i = 0; i < m; i++) {
            U.add(ob.nextInt());
        }
        System.out.println("enter size of A set: ");
        n = ob.nextInt();
        System.out.println("enter element:");
        for (int i = 0; i < n; i++) {
            A.add(ob.nextInt());
        }

        System.out.println("enter size of B set: ");
        o = ob.nextInt();
        System.out.println("enter element:");
        for (int i = 0; i < o; i++) {
            B.add(ob.nextInt());
        }

        int x = 0;
        for (int i = 0; i < U.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                if (U.get(i) == A.get(j)) {
                    x = 1;
                    a.add(x);
                    break;
                } else {
                    x = 0;
                }
            }
            if (x == 0) {
                a.add(x);
            }
        }
        
        int y = 0;
        for (int i = 0; i < U.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (U.get(i) == B.get(j)) {
                    y = 1;
                    b.add(y);
                    break;
                } else {
                    y = 0;
                }
            }
            if (y == 0) {
                b.add(y);
            }
        }

        // Object[] a1=a.toArray();
        //for (int i=0;i<a.size();i++)
        //{
        //  System.out.println(a1[i]);
        //}
        //Object[] b1=b.toArray();
        //for (int i=0;i<b.size();i++)
        //{
        //  System.out.println(b1[i]);
        //}
        ArrayList<Integer> a1 = new ArrayList<Integer>(a);
        ArrayList<Integer> b1 = new ArrayList<Integer>(b);
        System.out.println("Bitstring of A=" + a1);
        System.out.println("BitString of B=" + b1);
        System.out.print("A|B={");

        
        int k = 0;
        for (int i = 0; i < a1.size(); i++) {
            if (((a1.get(i)) | (b1.get(i))) == 1) {
                System.out.print(U.get(k) +" ");
                k++;
            } else {
                k++;
                continue;
            }
        }
        System.out.println("}");

        
        int l=0;
        System.out.print("A&B={");
        for (int i = 0; i < a1.size(); i++) {
            if (((a1.get(i))&(b1.get(i))) == 1) {
                System.out.print(U.get(l) +" ");
                l++;
            } else {
                l++;
                continue;
            }
        }
        System.out.println("}");
        
        int g=0;
        System.out.print("A(+)B = {");
        
        for (int i = 0; i < a1.size(); i++) {
            if (((a1.get(i))^(b1.get(i))) == 1) {
                System.out.print(U.get(g)+" ");
                g++;
            } else {
                g++;
                continue;
            }
        }
        System.out.println("}");
        
    }
}