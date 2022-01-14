package Zerodha;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import POM.Zerodhaautomate;
import Pojo.Callbrowser;
import Utility.Automatekite;

public class Automatezerodha {
	WebDriver driver ;
	@BeforeClass
	public void launchbrowser( ) {
	 driver = Callbrowser.browser("https://kite.zerodha.com/");
	}
	
	@Test
   public void checkpage() throws InterruptedException {
		Zerodhaautomate pom = new Zerodhaautomate(driver);
		System.out.println(pom.forgetpassword());
		System.out.println(pom.logovisible());
		System.out.println(pom.logintextvisible());
		pom.enteruserid("DAA677");
		pom.enterpassword("Velocity@123");
		pom.Clickonsubmit();
		Thread.sleep(3000);
		pom.enterpin("866918");
		pom.Clickoncontinue();
		Thread.sleep(5000);
		pom.entersearch("PMCFIN");
		pom.enterstock();
		
	}
	@AfterClass
	public  void screenshot( ) throws IOException {
		Automatekite.takesscreenshot(driver, "PMCFIN");
	}
	
	
	}
	


