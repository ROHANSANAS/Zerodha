package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	WebDriver driver;
	public static String timestamp () {
		return new SimpleDateFormat("yyyy-MM-DD HH-mm-ss").format(new Date());
		
		
	}
	public static void takesscreenshot (WebDriver driver , String name) throws IOException {
		Date currentdate = new Date();
		String namechange = currentdate.toString().replace(" ", "-").replace("", "-");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("D:\\java\\Kite.Zerotha\\Demo\\"+name+timestamp()+".png");
		FileHandler.copy(source, destination);
		
	}
	

}

