package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

	static WebDriver driver;
	static String browser;
	static String url;

	public static void readConfig() {
		Properties prop = new Properties();

		try {
			InputStream input = new FileInputStream("src\\main\\java\\data\\config.properties");

			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("Browser used :" + browser);
			url = prop.getProperty("url");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}


	public static WebDriver init() {

		readConfig();
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	public static void tearDown() {
		
		driver.close();
		driver.quit();
		
	}

}
