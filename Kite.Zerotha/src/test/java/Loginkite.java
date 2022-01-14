//import java.io.IOException;


//import org.apache.log4j.Logger;
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//
//import POM.LoginPage;
//import Pojo.LaunchBrowser;
//import Utility.Parameterization;
//import Utility.Screenshot;
//
//
//
////@Listeners(Test.)
////
//public class Loginkite {
//	WebDriver driver;
//	static Logger log = Logger.getLogger(Loginkite.class.getName());
//	
//	@BeforeMethod 
//	public void openbrowser() {
//		driver =  LaunchBrowser.callbrowser("https://kite.zerodha.com/");
//		
//	} 
//
//	@Test
//	public void kite() throws EncryptedDocumentException, IOException, InterruptedException {
//		 LoginPage pom = new  LoginPage(driver);
//		 Thread.sleep(2000);
//		 log.info("line-29");
//		 String username = Parameterization.getData(0, 0);
//	 pom.Enterusername(username);
//		 pom.Enterusername("RO8099");
//		 String password = Parameterization.getData(1, 1);
//		 pom.Enterpass(password);
//		 log.info("line-35");;
//	 pom.Enterpass("sanas");
//		 pom.ClickOnlogin();
//		 Screenshot.takesscreenshot(driver,"zerodha");
//	}
		 
//		 @Test()
//		 public void zero1() throws InterruptedException, EncryptedDocumentException, IOException {
//			 LoginPage pom1 =new LoginPage(driver);
//			 Thread.sleep(3000);
//			 String username1 = Parameterization.getData(1, 0);
//			 pom1.Enterusername(username1);
//			 String password1 = Parameterization.getData(1, 1);
//			 pom1.Enterpass(password1);
//			 pom1.ClickOnlogin();
//			 Screenshot.takesscreenshot(driver, "KITE");
//		 }
//			 
			 
			 
			 
		 
		 
		 
	
		
	}

