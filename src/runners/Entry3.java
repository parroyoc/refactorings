package runners;

import refactorings.previous.Entry3Duplication;
import refactorings.refactored.Entry3TemplateMethodImplementation1;
import refactorings.refactored.Entry3TemplateMethodImplementation2;

public class Entry3 {

	public static void main(String[] args) {
		Entry3Duplication instanceWithDuplication = new Entry3Duplication();
		instanceWithDuplication.similarMethod1(4);
		instanceWithDuplication.similarMethod2(5);
		
		Entry3TemplateMethodImplementation1 implementation1 = new Entry3TemplateMethodImplementation1();
		implementation1.similarMethod(4);
		Entry3TemplateMethodImplementation2 implementation2 = new Entry3TemplateMethodImplementation2();
		implementation2.similarMethod(4);
	}
}
