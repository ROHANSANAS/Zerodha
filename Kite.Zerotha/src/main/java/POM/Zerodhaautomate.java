package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaautomate {
	@FindBy(xpath="//input[@id=\"userid\"]") private WebElement userid ;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement password ;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement submit ;
	@FindBy(xpath="//img[@alt=\"Kite\"]") private WebElement logo;
	@FindBy(xpath="//a[@class=\"text-light forgot-link\"]") private WebElement forget ;
	@FindBy(xpath="//h2[text()=\"Login to Kite\"]") private WebElement logintext ;
	@FindBy(xpath="//input[@id=\"pin\"]") private WebElement pin ;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement cont ;
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement search ;
	@FindBy(xpath="//span[text()=\"PMCFIN\"]") private WebElement stock;
	
	public Zerodhaautomate (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserid(String name) {
		userid.sendKeys(name);
	}
	public void enterpassword(String pass ) {
		password.sendKeys(pass);
	}
	public void Clickonsubmit() {
		submit.click();
	}
	public void enterpin(String pins) {
		pin.sendKeys(pins);
	}
	public void Clickoncontinue() {
		cont.click();
	}
	public boolean logovisible() {
		return logo.isDisplayed();
	}
	public boolean forgetpassword( ) {
		return forget.isDisplayed();
	}
	public boolean logintextvisible ( ) {
		return logintext.isDisplayed();
	}
	public void entersearch (String stockname) {
		search.sendKeys(stockname);;
	}
	public void enterstock() {
		stock.click();
	}
	
	
	
	
		
	}



