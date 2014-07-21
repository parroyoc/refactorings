package refactorings.refactored;

import refactorings.util.Log;
import refactorings.util.OtherClass;

public class Entry2RefactoredByCommandPattern {

	public int similarMethod1(int x) {
		return commonMethod("similarMethod1", 40, x, new Entry2ExtensionCommand1());
	}

	public int similarMethod2(int x) {
		return commonMethod("similarMethod2", 20, x, new Entry2ExtensionCommand2());
	}

	private int commonMethod(String methodName, int baseValue, int x, IEntry2ExtensionCommand particularCommand) {
		Log.log("In " + methodName + " with param " + x);
		int result = (int) particularCommand.execute(baseValue, x);
		Log.log("result will be " + result);
		return result;
	}
	
	interface IEntry2ExtensionCommand {
		int execute(int baseValue, int x);
	}
	
	class Entry2ExtensionCommand1 implements IEntry2ExtensionCommand {
		public int execute(int baseValue, int x) {
			OtherClass.OtherMethod(x);
			return baseValue / x;
		}
	}
	
	class Entry2ExtensionCommand2 implements IEntry2ExtensionCommand {
		public int execute(int baseValue, int x) {
			return baseValue / x;
		}
	}
}
