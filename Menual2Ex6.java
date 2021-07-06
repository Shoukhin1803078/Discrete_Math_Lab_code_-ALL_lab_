package rezoansirlab;

public class Menual2Ex6 {

    public static void main(String[] args) {
        int a[] = {120, 23, 534, 23, 2, 1,};
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i-1; j >= 0; j--) {
                if (temp < a[j]) {
                   j=j+1;
                   a[j]=a[j-1];
                   a[j-1]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
    }
}
