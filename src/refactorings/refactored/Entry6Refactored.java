package refactorings.refactored;

import refactorings.util.DataBase;

public class Entry6Refactored {

	public class PropertyBean {
		private int property;
		public int getProperty() {return property;}
		public void setProperty(int property) {this.property=property;}
	}

	public class PropertyLoader {
		public PropertyBean loadProperty() {
			PropertyBean bean = new PropertyBean();
			bean.setProperty(DataBase.FakeGetValue());
			return bean;
		}		
	}
	
	public class PropertySaver {
		public void saveProperty(PropertyBean bean) {
			DataBase.FakeStoreValue(bean.getProperty());		
		}		
	}
	
	public class PropertyCalculator {
		public int getCalculation(PropertyBean bean) {
			return bean.getProperty()*2;
		}		
	}
}
