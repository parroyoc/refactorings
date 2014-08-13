package refactorings.previous;

import refactorings.util.DataBase;
import refactorings.util.Log;

public class Entry5MultipleResponsibility {

	public int AMultipleResponsibilitiesMethod(int x) {
		Log.log("In method, simple local tracing");
		Log.log("Calculating result");
		int y = DataBase.FakeGetValue();
		int result = x*y;
		Log.log("Storing and printing result");
		DataBase.FakeStoreValue(result);
		System.out.println("Result is "+ result);
		return result;
	}
}
