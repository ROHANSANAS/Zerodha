package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@id=\"userid\"]") private WebElement username;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement password;
	@FindBy(xpath="//a[text()=\"Forgot password?\"]") private WebElement login;
	@FindBy(xpath="//a[@class=\"text-light forgot-link\"]") private WebElement Forgetpass ;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void Enterusername(String name) {
		username.sendKeys(name);
	}
	public void Enterpass(String pass) {
		password.sendKeys(pass);
	}
	public void ClickOnlogin() {
		login.click();
	}
	public void ClickOnForgetpass() {
		Forgetpass.click();
	}
	
	
		
		
	}
	
	
	


