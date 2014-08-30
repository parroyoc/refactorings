package runners;

import refactorings.previous.Entry7ComplexConstructorWithOptionalParameters;
import refactorings.refactored.Entry7RefactoredBuilder;

public class Entry7 {

	public static void main(String[] args) {
		callConstructor();
		callBuilder();
	}

	private static void callConstructor() {
		Entry7ComplexConstructorWithOptionalParameters instance1, instance2, instance3;
		instance1 = new Entry7ComplexConstructorWithOptionalParameters("White", "M", "Name1", "Description1", false);
		instance2 = new Entry7ComplexConstructorWithOptionalParameters("Black", "M", "Name2", "Description2", false);
		instance3 = new Entry7ComplexConstructorWithOptionalParameters("White", "L", "Name3", "Description3", true);
	}

	private static void callBuilder() {
		Entry7ComplexConstructorWithOptionalParameters instance1, instance2, instance3;
		Entry7RefactoredBuilder builder = new Entry7RefactoredBuilder();
		instance1 = builder.start().withName("Name1").withColor("Description1").build();
		instance2 = builder.start().withName("Name2").withColor("Description2").withColor("Black").build();
		instance2 = builder.start().withName("Name3").withColor("Description3").withSize("M").withDiscount().build();
	}
}
