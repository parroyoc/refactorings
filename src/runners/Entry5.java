package runners;

import refactorings.previous.Entry5MultipleResponsibility;
import refactorings.refactored.Entry5Refactored;

public class Entry5 {

	public static void main(String[] args) {
		int x = 5;
		callNonRefactored(x);
		System.out.println();
		callRefactored(x);
	}

	private static void callNonRefactored(int x) {
		Entry5MultipleResponsibility instance = new Entry5MultipleResponsibility();
		System.out.println(instance.AMultipleResponsibilitiesMethod(x));
	}

	private static void callRefactored(int x) {
		Entry5Refactored instance = new Entry5Refactored();
		System.out.println(instance.ASingleResponsibilityMethod(x));
	}
}
