package refactorings.refactored;

import refactorings.util.Log;
import refactorings.util.OtherClass;
import refactorings.util.YetAnotherClass;

public abstract class Entry3RefactoredByAbstractTemplateMethodWithInheritance {

	protected int templateMethod(int x) {
		Log.log("Part1 common");
		OtherClass.OtherMethod(x);
		Log.log("Part1 uncommon");
		int result = doUncommonPart1(x);
		Log.log("Part2 common");
		YetAnotherClass.YetAnotherMethod(result);
		Log.log("Part2 uncommon");
		doUncommonPart2(x);
		Log.log("Part3 common");
		return result;
	}
	
	protected abstract int doUncommonPart1(int x);

	protected abstract void doUncommonPart2(int x);
}
