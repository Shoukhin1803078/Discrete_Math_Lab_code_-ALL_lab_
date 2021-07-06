package rezoan.sir.lab.code;

import java.util.Scanner;
import static rezoan.sir.lab.code.c1803078__2.f;

public class c1803078__3 {

	public static int f(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return n * f(n - 1);
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int a = 0;
		if (n == 1) {
			System.out.println("x^1y^1");
		} else {
			while (a != n + 1) {
				if (a == 0 || a == n) {
					if (a == 0) {
						System.out.print("x^" + n + "+");
					} else {
						System.out.print("y^" + n);
					}
				} else {
					System.out.print((f(n) / (f(a) * f(n - a))) + "x^" + (n - a) + "y^" + a + "+");
				}
				a++;
			}

		}

	}
}
