package rezoansirlab;

import java.util.Scanner;
import java.util.Vector;

public class b1803078__3 {

	static int n=10000000;
	static boolean a[]=new boolean[n];
	static Vector<Integer> v=new Vector();

	public static void seive(int n) {
		for (int i=0; i<a.length; i++) {
			a[i]=true;
		}
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (a[i]==true) {
				for (int j=i*i; j<n; j+=i) {
					a[j]=false;
				}
			}
		}
		for (int i=2; i<n; i++) {
			if (a[i]==true) {
				v.add(i);
			}
		}
		/*for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}*/
	}

	public static int gcd(int a, int b) {
		if (b==0) {
			return a;
		}
		int r=a%b;
		a=b;
		return gcd(a, r);
	}

	public static void main(String[] args) {
		seive(n);
		Scanner ob=new Scanner(System.in);
		int x=ob.nextInt();
		if (v.contains(x)) {
			System.out.println("Invalid Input");
		}
		else {
			Vector<Integer> Prime_factor=new Vector();
			for (int i=0; v.get(i)<=Math.sqrt(n); i++) {
				if ((x%v.get(i))==0) {
					while (x%v.get(i)==0) {
						Prime_factor.add(v.get(i));
						x=x/v.get(i);
					}
				}
			}
			//System.out.println(Prime_factor);
			for (int i=2; i<=n; i++) {
				
			}
		}
	}
}
