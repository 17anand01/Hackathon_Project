package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.carInsurance;


public class TC002_CARINSURANCE extends BaseClass{
	
	carInsurance ci;
	
	@Test(priority=0,groups= {"sanity"})
	public void carInsuranceClickTest() {
		ci=new carInsurance(BaseClass.getDriver());
		BaseClass.getLogger().info("************Object for carInsurance Page got created************");
		ci.clickCarInsurance();
		BaseClass.getLogger().info("************carlInsurance got clicked************");
		String exp="PolicyBazaar Car Insurance: Insure Your Car Today";
		String act=BaseClass.getDriver().getTitle();
		Assert.assertEquals(act, exp);
		BaseClass.getLogger().info("************carlInsurance Page title got verified************");
	}
	@Test(priority=1, dependsOnMethods="carInsuranceClickTest", groups= {"sanity","regression"})
	public void carInsuranceCarNumTest() {
		
		ci.carNum();
		BaseClass.getLogger().info("************Captured the error message for car************");
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void carInsuranceCarNumValueTest() {
		
		ci.carNumValue();
		BaseClass.getLogger().info("************Entered the car number************");
	}
	
	@Test(priority=3,groups= {"sanity","regression"})
	public void carInsuranceformFillTest() {
		
		ci.formFill();
		BaseClass.getLogger().info("************Captured the error message for email************");
	}
	@Test(priority=4,groups= {"sanity","regression"})
	public void clickPolicybazaar() {
		
		ci.clickPolicybazaar();
	}
	

}
