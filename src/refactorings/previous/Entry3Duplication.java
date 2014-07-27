package refactorings.previous;

import refactorings.util.*;

public class Entry3Duplication {

	public int similarMethod1(int x) {
		Log.log("Part1 common");
		OtherClass.OtherMethod(x);
		Log.log("Part1 uncommon");
		int result = 40 / x;
		Log.log("Part2 common");
		YetAnotherClass.YetAnotherMethod(result);
		Log.log("Part2 uncommon");
		AnotherClass.AnotherMethod(x);
		Log.log("Part3 common");
		return result;
	}

	public int similarMethod2(int x) {
		Log.log("Part1 common");
		OtherClass.OtherMethod(x);
		Log.log("Part1 uncommon");
		AnotherClass.AnotherMethod(x);
		int result = 20 / x;
		Log.log("Part2 common");
		YetAnotherClass.YetAnotherMethod(result);
		Log.log("Part3 common");
		return result;
	}
}
