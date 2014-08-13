package refactorings.refactored;

import refactorings.util.DataBase;
import refactorings.util.Log;

public class Entry5Refactored {

	public int ASingleResponsibilityMethod(int x) {
		logWrapper("In method, simple local tracing");
		int result = calculateResult(x);
		storeResult(result);
		printResult(result);
		return result;
	}

	private int calculateResult(int x) {
		logWrapper("Calculating result");
		int y = DataBase.FakeGetValue();
		return x*y;
	}

	private void storeResult(int result) {
		logWrapper("Storing result");
		DataBase.FakeStoreValue(result);
	}

	private void printResult(int result) {
		logWrapper("Printing result");
		System.out.println("Result is "+ result);
	}

	private void logWrapper(String message) {
		Log.log(message);
	}

}
