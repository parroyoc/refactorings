package refactorings.refactored;

import refactorings.util.Log;
import refactorings.util.OtherClass;
import java.lang.reflect.Method;

public class Entry2RefactoredByMethodReflection {

	public int similarMethod1(int x) throws Exception {
		return commonMethod("similarMethod1", 40, x, Entry2RefactoredByMethodReflection.class.getMethod("particularPartOfMethod1", Integer.class, Integer.class));
	}

	public int similarMethod2(int x) throws Exception {
		return commonMethod("similarMethod2", 20, x, Entry2RefactoredByMethodReflection.class.getMethod("particularPartOfMethod2", Integer.class, Integer.class));
	}

	private int commonMethod(String methodName, int baseValue, int x, Method particularMethod) throws Exception {
		Log.log("In " + methodName + " with param " + x);
		int result = (int) particularMethod.invoke(this, new Object[] {baseValue, x});
		Log.log("result will be " + result);
		return result;
	}
	
	public int particularPartOfMethod1(Integer baseValue, Integer x) {
		OtherClass.OtherMethod(x);
		return baseValue / x;
	}
	
	public int particularPartOfMethod2(Integer baseValue, Integer x) {
		return baseValue / x;
	}
}
