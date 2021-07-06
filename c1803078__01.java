package rezoan.sir.lab.code;

import java.util.Scanner;
import java.util.Vector;

public class c1803078__01 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int a[] = new int[n];
		int b1[] = new int[n];
		int b2[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = ob.nextInt();
			b1[i] = 1;
			b2[i] = 1;
		}
		/*for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				if (a[i] > a[j]) {
					if (b1[i] < b1[j] + 1) {
						b1[i] = b1[j] + 1;
					}
				}
			}
		}
		int mi = 0;
		for (int i = 1; i < b1.length; i++) {
			if (b1[i] > b1[mi]) {
				mi = i;
			}
		}
		System.out.println(mi);
		Vector<Integer> v = new Vector();
		v.add(a[mi]);
		for (int i = mi - 1; i >= 0; i--) {
			if (a[i] < a[mi]) {
				v.add(a[i]);
			}
		}
		System.out.println("Increasing sequence is : ");
		for (int i = v.size() - 1; i >= 0; i--) {
			System.out.print(v.get(i) + " ");
		}*/
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i]<a[j] && b2[i] < (b2[j] + 1)) {
					b2[i] = b2[j] + 1;
				}
			}
		}
		for (int i = 1; i < b2.length; i++) {
			System.out.print(b2[i]+" ");
		}
	}
}
