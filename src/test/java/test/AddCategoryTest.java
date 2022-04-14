package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	
	WebDriver driver;
	String categoryName;
	
	
	
	@Test
	public void UserShouldbeAbletoAddCategory() throws Exception {
		driver= BrowserFactory.init();
		AddCategoryPage page=PageFactory.initElements(driver, AddCategoryPage.class);
		
		page.addCategory(categoryName);
		
		page.validateCategoryAdded();
		
		
	} 
	
	

}
