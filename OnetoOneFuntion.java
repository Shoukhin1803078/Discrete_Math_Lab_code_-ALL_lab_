package rezoansirlab;

import java.util.ArrayList;

public class OnetoOneFuntion {

    public static void function(ArrayList<Integer> x, int n) {
         ArrayList<Integer > y=new ArrayList<Integer > ();
        for (int i = 0; i <n; i++) {
         //   y.set(i, x.get(i) * x.get(i));
            System.out.println(x.get(i));
        }
   
    }
    public static void f(ArrayList<Integer> x,int n)
    {
        for (int i=0;i<n;i++)
        {
        System.out.println(x.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer > x=new ArrayList<Integer > ();
        x.add(1);
        x.add(2);
        x.add(3);
       //f(x,x.size());
      function(x,x.size());
    }
}
