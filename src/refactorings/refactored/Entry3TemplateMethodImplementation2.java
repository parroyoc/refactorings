package refactorings.refactored;

import refactorings.util.AnotherClass;

public class Entry3TemplateMethodImplementation2 extends Entry3RefactoredByAbstractTemplateMethodWithInheritance {

	public int similarMethod(int x) {
		return super.templateMethod(x);
	}

	@Override
	public int doUncommonPart1(int x) {
		AnotherClass.AnotherMethod(x);
		return 20 / x;
	}

	@Override
	public void doUncommonPart2(int x) {
		// Nothing here. This method could be also virtual
	}
}
