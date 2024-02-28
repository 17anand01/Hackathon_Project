package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.carInsurance;


public class TC002_CARINSURANCE extends BaseClass{
	carInsurance obj;
	@Test(priority=0,groups= {"sanity"})
	public void carInsuranceClickTest() {
		obj= new carInsurance(BaseClass.getDriver());
		BaseClass.getLogger().info("************Object for carInsurance Page got created************");
		obj.clickCarInsurance();
		BaseClass.getLogger().info("************carlInsurance got clicked************");
		String exp="PolicyBazaar Car Insurance: Insure Your Car Today";
		String act=BaseClass.getDriver().getTitle();
		Assert.assertEquals(act, exp);
		BaseClass.getLogger().info("************carlInsurance Page title got verified************");
	}
	@Test(priority=1, dependsOnMethods="carInsuranceClickTest", groups= {"sanity","regression"})
	public void carInsuranceCarNumTest() {
		obj= new carInsurance(BaseClass.getDriver());
		obj.carNum();
		BaseClass.getLogger().info("************Captured the error message for car************");
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void carInsuranceCarNumValueTest() {
		obj= new carInsurance(BaseClass.getDriver());
		obj.carNumValue();
		BaseClass.getLogger().info("************Entered the car number************");
	}
	
	@Test(priority=3,groups= {"sanity","regression"})
	public void carInsuranceformFillTest() {
		obj= new carInsurance(BaseClass.getDriver());
		obj.formFill();
		BaseClass.getLogger().info("************Captured the error message for email************");
	}
	@Test(priority=4,groups= {"sanity","regression"})
	public void clickPolicybazaar() {
		obj= new carInsurance(BaseClass.getDriver());
		obj.clickPolicybazaar();
	}
	

}
