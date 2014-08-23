package refactorings.previous;

import refactorings.util.DataBase;

public class Entry6MultipleResponsibilityClass {

	int property;
	
	public void loadProperty() {
		property = DataBase.FakeGetValue();
	}
	
	public void saveProperty() {
		DataBase.FakeStoreValue(property);		
	}
	
	public int getCalculation() {
		return property*2;
	}
}
