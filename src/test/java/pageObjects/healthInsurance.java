package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import utilities.excelUtils;

public class healthInsurance extends BasePage{

	public healthInsurance(WebDriver driver) {
		super(driver);
	}
	Actions action=new Actions(driver);
	
	@FindBy(xpath="//a[text()='Insurance Products ']")
	WebElement insuranceProducts;
	
	@FindBy(xpath="//li//div[3]/ul/li")
	List<WebElement> healthInsuranceItems;
	
	public void moveToHealthInsurance() {
		action.moveToElement(insuranceProducts).perform();
	}
	public void healthInsuranceItems() {
		int row=4;
		String data="";
		
		for(WebElement items : healthInsuranceItems) {
			data=items.getText();
			System.out.println(data);
			
			try {
				excelUtils.write("Sheet1", row, 0, data);
				row++;
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
