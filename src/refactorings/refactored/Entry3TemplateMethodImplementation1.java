package refactorings.refactored;

import refactorings.util.AnotherClass;

public class Entry3TemplateMethodImplementation1 extends Entry3RefactoredByAbstractTemplateMethodWithInheritance {

	public int similarMethod(int x) {
		return super.templateMethod(x);
	}

	@Override
	public int doUncommonPart1(int x) {
		return 40 / x;
	}

	@Override
	public void doUncommonPart2(int x) {
		AnotherClass.AnotherMethod(x);
	}
}
