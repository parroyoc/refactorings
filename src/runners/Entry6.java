package runners;

import refactorings.previous.Entry6MultipleResponsibilityClass;
import refactorings.refactored.Entry6Refactored;
import refactorings.refactored.Entry6Refactored.*;

public class Entry6 {

	public static void main(String[] args) {
		int x = 5;
		callNonRefactored(x);
		callRefactored(x);
	}

	private static void callNonRefactored(int x) {
		Entry6MultipleResponsibilityClass instance = new Entry6MultipleResponsibilityClass();
		instance.loadProperty();
		instance.getCalculation();
		instance.saveProperty();
	}

	private static void callRefactored(int x) {
		Entry6Refactored instance = new Entry6Refactored();
		PropertyLoader loader = instance.new PropertyLoader();
		PropertyBean bean = loader.loadProperty();
		PropertyCalculator calculator = instance.new PropertyCalculator();
		calculator.getCalculation(bean);
		PropertySaver saver = instance.new PropertySaver();
		saver.saveProperty(bean);
	}
}
