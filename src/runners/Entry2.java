package runners;

import refactorings.previous.Entry2Duplication;
import refactorings.refactored.Entry2RefactoredByCommandPattern;
import refactorings.refactored.Entry2RefactoredByMethodReflection;

public class Entry2 {

	public static void main(String[] args) {
		Entry2Duplication instanceWithDuplication = new Entry2Duplication();
		instanceWithDuplication.similarMethod1(4);
		instanceWithDuplication.similarMethod2(5);
		
		Entry2RefactoredByMethodReflection instanceRefactored = new Entry2RefactoredByMethodReflection();
		try {
			instanceRefactored.similarMethod1(4);
			instanceRefactored.similarMethod2(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Entry2RefactoredByCommandPattern instanceRefactored2 = new Entry2RefactoredByCommandPattern();
		instanceRefactored2.similarMethod1(4);
		instanceRefactored2.similarMethod2(5);
	}
}
