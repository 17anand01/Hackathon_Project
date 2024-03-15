package pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import factory.BaseClass;
import utilities.excelUtils;

public class travelInsurance extends BasePage{

	public travelInsurance(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Select s;
	
	
	@FindBy(xpath="//a[text()='Travel Insurance']")
	WebElement travelInsurance;
	
	@FindBy(xpath="//span[text()='Germany']")
	WebElement germany;
	
	@FindBy(xpath="(//button[text()='Continue'])[2]")
	WebElement nextButton;
	
	@FindBy(xpath="//div[starts-with(@class,'lightpick__day is-')]")
	List<WebElement> dates;
	
	@FindBy(xpath="//input[@id='startdate']")
	WebElement fromDate;
	
	@FindBy(id="enddate")
	WebElement toDate;
	
	@FindBy(xpath="//button[@class='lightpick__next-action']")
	WebElement nextArrowButton;
	
	@FindBy(xpath="(//button[text()='Continue'])[1]")
	WebElement nextButton1;
	
	@FindBy(id="tcl-item-2")
	WebElement twoTraveller;
	
	@FindBy(id="travellerAge1")
	WebElement traveller1;
	
	@FindBy(id="travellerAge2")
	WebElement traveller2;
	
	@FindBy(xpath="(//label[@class='radioButton'])[2]")
	WebElement selectNo;
	
	@FindBy(id="travelmobile")
	WebElement mobileNum;
	
	@FindBy(xpath="(//button[text()='View plans'])[1]")
	WebElement viewPlansButton;
	
	@FindBy(xpath="//span[@class='exitIntentPopup__box__closePop']")
	WebElement popup;
	
	@FindBy(xpath="//p[text()='Sort by']")
	WebElement sortBy;
	
	@FindBy(id="17_sort")
	WebElement lowToHigh;
	
	@FindBy(id="studentTrip")
	WebElement studentTrip;
	
	@FindBy(id="Traveller_1")
	WebElement Traveller1;
	
	@FindBy(id="Traveller_2")
	WebElement Traveller2;
	
	@FindBy(id="feet")
	WebElement dropDown;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement applyButton;
	
	@FindBy(xpath="//p[@class='quotesCard--insurerName']")
	List<WebElement> companyNames;
	
	@FindBy(xpath="//span[@class='premiumPlanPrice']")
	List<WebElement> insurancePrice;
	
	@FindBy(xpath="//a[text()='Policybazaar']")
	WebElement clickPolicybazaar;
	
	String[] data=excelUtils.read();
	
	public void clickTravelInsurance() {
		js.executeScript("arguments[0].scrollIntoView();", travelInsurance);
		js.executeScript("arguments[0].click();", travelInsurance);
		js.executeScript("arguments[0].click();", germany);
		js.executeScript("arguments[0].click();", nextButton);
		
	}
	
	public void selectDate() {
		Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd");
	    String str = formatter.format(date);
	    String strPattern = "^0+(?!$)";
	    str = str.replaceAll(strPattern, "");
	    BaseClass.explicitWait(driver, Duration.ofSeconds(20), fromDate);
	    try {
	    	fromDate.click();
	    	js.executeScript("arguments[0].click();", fromDate);
		for(WebElement date1 : dates) {
			if(date1.getText().equals(str)) {
				date1.click();
				break;
			}
		}
		nextArrowButton.click();
		for(WebElement date1 : dates) {
			if(date1.getText().equals(str)) {
				date1.click();
				break;
			}
		}
	    }catch(Exception e) {
	    	
	    }
	    js.executeScript("arguments[0].click();", nextButton1);
		
	}	
	
	public void selectTwo(){
		js.executeScript("arguments[0].click();", twoTraveller);
		traveller1.click();
		s=new Select(traveller1);
		s.selectByValue("21");
		s=new Select(traveller2);
		s.selectByValue("22");
		js.executeScript("arguments[0].click();", nextButton1);
	}
	
	public void selectNo() {
		selectNo.click();

	}
	
	public void mobileNum(){
		mobileNum.click();
		mobileNum.sendKeys(data[0]);
		viewPlansButton.click();
	}
	
	public void selectStudent() {
		BaseClass.explicitWait(driver, Duration.ofSeconds(30), popup);
		if(popup.isDisplayed()) {
			js.executeScript("arguments[0].click();", popup);
		}
		else {
			
		}
		js.executeScript("arguments[0].click();", studentTrip);
		
	}
	
	public void selectTraveller() {
		js.executeScript("arguments[0].click();", Traveller1);
		js.executeScript("arguments[0].click();", Traveller2);
		s=new Select(dropDown);
		s.selectByValue("1");
		applyButton.click();
		BaseClass.explicitWait(driver, Duration.ofSeconds(30), sortBy);
	}
	
	
	public void lowToHigh() {
		js.executeScript("arguments[0].click();", sortBy);
		BaseClass.explicitWait(driver, Duration.ofSeconds(30), lowToHigh);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		js.executeScript("arguments[0].click();", lowToHigh);
		int row=0;
		for(int i=0;i<3;i++) {
			System.out.println(companyNames.get(i).getText());
			try {
				excelUtils.write("Sheet1", row, 0, companyNames.get(i).getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(insurancePrice.get(i).getText());
			try {
				excelUtils.write("Sheet1", row, 1, insurancePrice.get(i).getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
			row++;
		}
		clickPolicybazaar.click();
	}
}