package rezoansirlab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShiftCipher {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		int k=ob.nextInt();
		System.out.println((int) s.charAt(0));
		HashMap<Integer,Character> h=new HashMap();
		for (int i=0; i<s.length(); i++) {
			h.put((int) s.charAt(i)-65, s.charAt(i));
		}
		System.out.println();
		int a[]=new int[s.length()];
		out:
		for (int i=0; i<s.length(); i++) {
			for (Object j : h.entrySet()) {
				if ((char) j==s.charAt(i)) {
					int x=i;
					x+=k;
					x=x%26;
					for (Object k1 : h.keySet()) {
						if ((int) k1==x) {
							a[i]=(int) k1;
						}
						continue out;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
