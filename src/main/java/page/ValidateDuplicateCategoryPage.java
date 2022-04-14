package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateDuplicateCategoryPage {

	WebDriver driver;
	
	@FindBy(how = How.CSS,using = "div.controls>:nth-last-child(3)") WebElement NEW_ADD_CATAGORY;
	@FindBy(how= How.CSS, using = "input[name='categorydata']" )	WebElement ADD_CATAGORY_ELEMENT;
	@FindBy(how= How.CSS, using = "input[value='Add category']" )	WebElement ADD_CATAGORY;
	
	
	
	public void validateDuplicate() throws Exception {
		
		String newAddedcategory = NEW_ADD_CATAGORY.getText();
		ADD_CATAGORY_ELEMENT.sendKeys(newAddedcategory);
		Thread.sleep(3000);
		ADD_CATAGORY.click();;
		System.out.println("The category you want to add already exists: " + newAddedcategory );
	}
}
