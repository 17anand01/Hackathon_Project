package pageObjects;




import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.excelUtils;

public class carInsurance extends BasePage{

	public carInsurance(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
	BaseClass obj=new BaseClass();
	Actions act=new Actions(driver);

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
	
	@FindBy(xpath="//p[text()='Car']")
	WebElement carInsurance1;
	
	@FindBy(id="regNoTextBox")
	WebElement inputBox1;
	
	@FindBy(xpath="//button[text()='View Prices ']")
	WebElement viewPriceButton1;
	
	@FindBy(xpath="//p[starts-with(@class,'redText mt-8 ')]")
	WebElement errorCarMsg1;
	
	@FindBy(xpath="//input[@placeholder='Full name']")
	WebElement nameInputBox1;
	
	@FindBy(xpath="//input[@placeholder='Your email']")
	WebElement emailInputBox1;
	
	@FindBy(xpath="//div[@class='errorMsg']")
	WebElement emailErrorMsg1;
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	WebElement mobileInputBox1;
	
	@FindBy(xpath="//img[@alt='editIcon']")
	WebElement editButton;
	
	@FindBy(xpath="//img[@alt='policybazaar']")
	WebElement clickPolicybazaar1;
	
	String[] data=excelUtils.read();
	
	public void clickCarInsurance() {
		driver.navigate().refresh();
		js.executeScript("arguments[0].click();",carInsurance);
		BaseClass.explicitWait(driver, Duration.ofSeconds(10), inputBox);

	}
	
	public void carNum() {
		try {
			inputBox1.click();
			viewPriceButton1.click();
			System.out.println(errorCarMsg1.getText());
			
		}catch(Exception e) {
			if(clickPolicybazaar.isDisplayed()){
				inputBox.click();
				viewPriceButton.click();
				System.out.println(errorCarMsg.getText());
			}
		
		}
	
		
	}
	
	public void carNumValue() {
		try {
			if(clickPolicybazaar1.isDisplayed()) {
			inputBox1.click();
			inputBox1.sendKeys(data[1]);
			viewPriceButton1.click();
			
			}

		}catch(Exception e) {
			if(clickPolicybazaar.isDisplayed()){
				inputBox.click();
				inputBox.sendKeys(data[1]);
				js.executeScript("arguments[0].click();", viewPriceButton);

			}
			
		}
	}
	
	public void formFill(){
		try {
			js.executeScript("arguments[0].click();", nameInputBox1);
			nameInputBox1.sendKeys(data[2]);
			js.executeScript("arguments[0].click();", emailInputBox1);
			emailInputBox1.sendKeys(data[3]);
			try {
				act.moveToElement(mobileInputBox1).click().perform();
				System.out.println(emailErrorMsg1.getText());
				mobileInputBox1.sendKeys(data[0]);
			
			}catch(Exception e) {
				if(editButton.isDisplayed()) {
					js.executeScript("arguments[0].click();", editButton);
					act.moveToElement(mobileInputBox1).click().perform();
					System.out.println(emailErrorMsg1.getText());
					mobileInputBox1.sendKeys(data[0]);
					}
			}
			
		}catch(Exception e) {
			if(clickPolicybazaar.isDisplayed()) {
				js.executeScript("arguments[0].click();", nameInputBox);
				nameInputBox.sendKeys(data[2]);
				js.executeScript("arguments[0].click();", emailInputBox);
				emailInputBox.sendKeys(data[3]);
				System.out.println(emailErrorMsg.getText());
				js.executeScript("arguments[0].click();", mobileInputBox);
				mobileInputBox.sendKeys(data[0]);
				}	
				
		}
		
	}
	public void clickPolicybazaar() {
		try {
			
			clickPolicybazaar1.click();
		
		}catch(Exception e) {
			
			if(clickPolicybazaar.isDisplayed()){
				clickPolicybazaar.click();
				}
			
		}
	}

}
