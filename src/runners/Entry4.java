package runners;


import java.util.ArrayList;

import refactorings.previous.Entry4NamingAndSpaguettiCode;
import refactorings.refactored.Entry4Refactored;
import refactorings.refactored.Entry4RefactoredStep1Naming;

public class Entry4 {

	public static void main(String[] args) {
		int max = 50;
		callNonRefactored(max);
		System.out.println();
		callRefactoredNaming(max);
		System.out.println();
		callRefactoredFull(max);
	}

	private static void callNonRefactored(int max) {
		Entry4NamingAndSpaguettiCode instance = new Entry4NamingAndSpaguettiCode();
		print(instance.GetPrimes(max), max);
	}

	private static void callRefactoredNaming(int max) {
		Entry4RefactoredStep1Naming instance = new Entry4RefactoredStep1Naming();
		print(instance.GetPrimesUpTo(max), max);
	}

	private static void callRefactoredFull(int max) {
		Entry4Refactored instance = new Entry4Refactored();
		print(instance.GetPrimesUpTo(max), max);
	}

	private static void print(ArrayList<Integer> results, int max) {
		System.out.print("Primes up to " + max + ":");
		for(Integer prime : results) {
			System.out.print(" " + prime);
		}
	}
}
