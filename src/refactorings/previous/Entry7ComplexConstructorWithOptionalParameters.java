package refactorings.previous;

public class Entry7ComplexConstructorWithOptionalParameters {

	String color;
	String size;
	String name;
	String description;
	boolean hasDiscount;

	public Entry7ComplexConstructorWithOptionalParameters(
			String color, String size, String name, String description, boolean hasDiscount) {
		this.color = color;
		this.size = size;
		this.name = name;
		this.description = description;
		this.hasDiscount = hasDiscount;
	}
}
