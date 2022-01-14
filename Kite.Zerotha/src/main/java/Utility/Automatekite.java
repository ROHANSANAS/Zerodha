package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Automatekite {
	WebDriver driver;
	public static String time( ) {
	return new	 SimpleDateFormat("YYYY-MM-DD HH-MM-SS").format(new Date());
	
	}
	public static void takesscreenshot(WebDriver driver , String name) throws IOException {
		Date currentdate = new Date ();
		String namechange=currentdate.toString().replace("", "-").replace("", "-");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination =new File ("D:\\java\\Kite.Zerotha\\Automatekite\\"+name+time()+".png");
		FileHandler.copy(source, Destination);
		
	
	}
		
	}

	
	


