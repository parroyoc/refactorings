package refactorings.refactored;

import refactorings.previous.Entry7ComplexConstructorWithOptionalParameters;

public class Entry7RefactoredBuilder {				
	private static final String DEFAULT_COLOR = "White";
	private static final String DEFAULT_SIZE = "M";
	
	String color;
	String size;
	String name;
	String description;
	boolean hasDiscount;
	
	public Entry7RefactoredBuilder start() {
		this.color = DEFAULT_COLOR;
		this.size = DEFAULT_SIZE;
		this.name = "";
		this.description = "";
		this.hasDiscount = false;
		return this;
	}
	
	public Entry7RefactoredBuilder withColor(String color) {
		this.color = color;
		return this;
	}

	public Entry7RefactoredBuilder withSize(String size) {
		this.size = size;
		return this;
	}

	public Entry7RefactoredBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public Entry7RefactoredBuilder withDescription(String description) {
		this.description = description;
		return this;
	}

	public Entry7RefactoredBuilder withDiscount() {
		this.hasDiscount = true;
		return this;
	}
	
	public Entry7ComplexConstructorWithOptionalParameters build() {
		return new Entry7ComplexConstructorWithOptionalParameters(color, size, name, description, hasDiscount);
	}
}
