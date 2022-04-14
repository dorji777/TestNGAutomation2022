package page;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {
	WebDriver driver;
	String categoryName;
	String name;
	
	
	@FindBy(how= How.CSS, using = "input[name='categorydata']" )	WebElement ADD_CATAGORY_ELEMENT;
	@FindBy(how= How.CSS, using = "input[value='Add category']" )	WebElement ADD_CATAGORY;
	@FindBy(how = How.CSS,using = "div.controls>:nth-last-child(3)") WebElement NEW_ADD_CATAGORY;
	
	public int randomNumber(int No) {
		
		Random rnd= new Random();
		int rndNo=rnd.nextInt(No);
		return rndNo;
		
	}
	
	public void addCategory(String categoryName) throws Exception {
		categoryName="TestNG";
		name=categoryName+randomNumber(999);
		ADD_CATAGORY_ELEMENT.sendKeys(name);
		Thread.sleep(3000);
		ADD_CATAGORY.click();
		
	}
	
	public void validateCategoryAdded() {
		
		String NewAdded=NEW_ADD_CATAGORY.getText();
		
		System.out.println("New Category Added is :" + NewAdded);
	}
}
