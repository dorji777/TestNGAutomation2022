package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ValidateMonthDropDownPage {
	WebDriver driver;

		@FindBy(how = How.CSS, using ="select[name='due_month']") WebElement Month_DropList;
		@FindBy(how= How.CSS, using ="*[id='extra']select[3]") WebElement Click_Month_DropList;

		
	public void validateMonthDropdownlist() {
		
			String[] arr = {"Month","Jan","Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			
			Select sel = new Select(Month_DropList);
			
			List<WebElement> months = sel.getOptions();  
		
			for (WebElement we:months) {
				for(int i=1;i< arr.length;i++) {
					
					if (we.getText().equals(arr[i])) {
						
						System.out.println("List of Months :"+ we.getText() +" " +  arr[i] + "  Matched" );
						
					}
					
				} 
				
			}
			
	}	
}
