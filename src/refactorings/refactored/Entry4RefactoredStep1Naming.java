package refactorings.refactored;

import java.util.ArrayList;

public class Entry4RefactoredStep1Naming {

	private static final int MINIMUM_PRIME = 1;
	private static final int MINIMUM_DIVISOR = 2;

	public ArrayList<Integer> GetPrimesUpTo(int target) {
		ArrayList<Integer> resultingPrimes = new ArrayList<Integer>();	
		for (int candidate=MINIMUM_PRIME;candidate<=target;candidate++) {
			boolean isPrime=true;
			for (int divisor=MINIMUM_DIVISOR;divisor<candidate;divisor++) {
				if (candidate%divisor==0) isPrime=false;
			}
			if (isPrime) resultingPrimes.add(candidate);
		}
		return resultingPrimes;
	}
}
