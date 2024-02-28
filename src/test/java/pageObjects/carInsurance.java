package pageObjects;




import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.excelUtils;

public class carInsurance extends BasePage{

	public carInsurance(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
	BaseClass obj=new BaseClass();

	@FindBy(xpath="//p[text()='Car']")
	WebElement carInsurance;
	
	@FindBy(id="regNoTextBox")
	WebElement inputBox;
	
	@FindBy(id="btnGetQuotes")
	WebElement viewPriceButton;
	
	@FindBy(id="error_car_number")
	WebElement errorCarMsg;
	
	@FindBy(id="name")
	WebElement nameInputBox;
	
	@FindBy(id="email")
	WebElement emailInputBox;
	
	@FindBy(xpath="//div[@class='msg-error show']")
	WebElement emailErrorMsg;
	
	@FindBy(id="mobileNo")
	WebElement mobileInputBox;
	
	@FindBy(xpath="//a[@class='pb-logo']")
	WebElement clickPolicybazaar;
	
	String[] data=excelUtils.read();
	
	public void clickCarInsurance() {
		js.executeScript("arguments[0].click();",carInsurance);
		BaseClass.explicitWait(driver, Duration.ofSeconds(10), inputBox);

	}
	
	public void carNum() {
		inputBox.click();
		viewPriceButton.click();
		System.out.println(errorCarMsg.getText());
		
	}
	
	public void carNumValue() {
		inputBox.click();
		inputBox.sendKeys(data[1]);
		viewPriceButton.click();
	}
	
	public void formFill(){
		js.executeScript("arguments[0].click();", nameInputBox);
		nameInputBox.sendKeys(data[2]);
		js.executeScript("arguments[0].click();", emailInputBox);
		emailInputBox.sendKeys(data[3]);
		System.out.println(emailErrorMsg.getText());
		js.executeScript("arguments[0].click();", mobileInputBox);
		mobileInputBox.sendKeys(data[0]);
		
	}
	public void clickPolicybazaar() {
		clickPolicybazaar.click();
	}

}
