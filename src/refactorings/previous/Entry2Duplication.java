package refactorings.previous;

import refactorings.util.Log;
import refactorings.util.OtherClass;

public class Entry2Duplication {

	public int similarMethod1(int x) {
		Log.log("In similarMethod1 with param " + x);
		OtherClass.OtherMethod(x);
		int result = 40 / x;
		Log.log("result will be " + result);
		return result;
	}

	public int similarMethod2(int x) {
		Log.log("In similarMethod2 with param " + x);
		int result = 20 / x;
		Log.log("result will be " + result);
		return result;
	}
}
