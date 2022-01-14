package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Callbrowser {
	public static WebDriver browser (String url) {
		System.setProperty("webdriver.chrome.driver","D:\\CHRO\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get(url);
		return driver;
		
		
	}
	

}
