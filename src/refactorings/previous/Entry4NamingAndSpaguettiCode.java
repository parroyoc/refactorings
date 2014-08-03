package refactorings.previous;

import java.util.ArrayList;

public class Entry4NamingAndSpaguettiCode {

	public ArrayList<Integer> GetPrimes(int x) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i=1;i<=x;i++) {
			boolean flag=true;
			for (int j=2;j<i;j++) {
				if (i%j==0) flag=false;
			}
			if (flag) res.add(i);
		}
		return res;
	}
}
