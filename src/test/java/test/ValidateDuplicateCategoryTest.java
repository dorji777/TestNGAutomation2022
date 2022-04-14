package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.ValidateDuplicateCategoryPage;
import util.BrowserFactory;

public class ValidateDuplicateCategoryTest {

	WebDriver driver;
	
	
	@Test
	public void validateDuplicate() throws Exception {
		
		driver=BrowserFactory.init();
		ValidateDuplicateCategoryPage page= PageFactory.initElements(driver,ValidateDuplicateCategoryPage.class);
		
		page.validateDuplicate();
		
		
	}
}
