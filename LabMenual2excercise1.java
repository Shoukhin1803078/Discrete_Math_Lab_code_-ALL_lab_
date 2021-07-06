package rezoansirlab;
import java.util.Scanner;
import java.util.Vector;

public class LabMenual2excercise1 {
    
    public static void union(int m, int n, int p, int A[], int B[], int U[]) {

        int u[] = new int[m];
        int a[] = new int[m];
        int b[] = new int[m];

        int k = 0;

        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (U[i] == A[j]) {
                    a[k] = 1;
                    k++;
                } else {
                    a[k] = 0;
                    k++;
                }

            }
        }

        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (U[i] == B[j]) {
                    b[k] = 1;
                    k++;
                } else {
                    b[k] = 0;
                    k++;
                }

            }
        }

        for (int i = 0; i < a.length; i++) {
            int s = a[i] & b[i];
            if (s == 1) {
                System.out.println(U[i]);

            }
        }
    }
    
    public static void interset() {

    }

    public static void exor() {

    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("inter size for universal set:");
        int m;
        m = ob.nextInt();
        int U[] = new int[m];
        System.out.println("Enter U set element : ");
        for (int i = 0; i < m; i++) {
            U[i] = ob.nextInt();
        }

        System.out.println("inter size for A set:");
        int n;
        n = ob.nextInt();
        int A[] = new int[n];
        System.out.println("Enter A set element : ");
        for (int i = 0; i < n; i++) {
            U[i] = ob.nextInt();
        }

        System.out.println("inter size for B set:");
        int p;
        p = ob.nextInt();
        int B[] = new int[p];
        System.out.println("Enter B set element : ");
        for (int i = 0; i < p; i++) {
            U[i] = ob.nextInt();
        }

        int x;
        System.out.println("Enter choice :\npress 1 for AUB\npress 2 for AnB \npress 3 for A(+)B\n");
        x = ob.nextInt();
        switch (x) {
            case 1: {
                union(m, n, p, A, B, U);
            }
            break;
            case 2: {
                interset();
            }
            break;
            case 3: {
                exor();
            }
            break;
            default:
                System.out.println("You input worng key ");
        }

    }
}