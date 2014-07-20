package runners;

import refactorings.previous.Entry1Duplication;
import refactorings.refactored.Entry1Refactored;

public class Entry1 {

	public static void main(String[] args) {
		Entry1Duplication instanceWithDuplication = new Entry1Duplication();
		instanceWithDuplication.similarMethod1(4);
		instanceWithDuplication.similarMethod1(5);
		
		Entry1Refactored instanceRefactored = new Entry1Refactored();
		instanceRefactored.similarMethod1(4);
		instanceRefactored.similarMethod1(5);
	}
}
