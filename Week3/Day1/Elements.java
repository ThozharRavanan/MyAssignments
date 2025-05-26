package Week3.Day1;

public class Elements extends Button {
	
	public static void main(String[] args) {
		
		Elements e = new Elements();
		//Calling methods from Base Class
		e.click();
		e.setText("Text");
		//Calling methods from Button class
		e.submit();
		//Calling methods from CheckBoxButton class
		CheckBoxButton c = new CheckBoxButton();
		c.clickCheckButton();
		//Calling methods from RadioButton class
		RadioButton r = new RadioButton();
		r.selectRadioButton();
	}

}
