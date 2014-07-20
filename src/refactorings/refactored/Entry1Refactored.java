package refactorings.refactored;

import refactorings.previous.OtherClass;
import refactorings.util.Log;

public class Entry1Refactored {

	public int similarMethod1(int x) {
		return commonMethod("similarMethod1", 40, x);
	}

	public int similarMethod2(int x) {
		return commonMethod("similarMethod2", 20, x);
	}
	
	private int commonMethod(String methodName, int baseValue, int x) {
		Log.log("In " + methodName + " with param " + x);
		OtherClass.OtherMethod(x);
		int result = baseValue / x;
		Log.log("result will be " + result);
		return result;
	}

}
