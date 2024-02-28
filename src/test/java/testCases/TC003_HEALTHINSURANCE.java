package testCases;

import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.healthInsurance;


public class TC003_HEALTHINSURANCE extends BaseClass{
	
	@Test(priority=0,groups= {"sanity"})
	public void moveTohealthInsurance() {
		healthInsurance obj=new healthInsurance(BaseClass.getDriver());
		BaseClass.getLogger().info("************Object for healthInsurance Page got created************");
		obj.moveToHealthInsurance();;
		
	}
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void healthInsuranceTest() {
		healthInsurance obj=new healthInsurance(BaseClass.getDriver());
		obj.moveToHealthInsurance();
		obj.healthInsuranceItems();
		BaseClass.getLogger().info("************Captured all the menu items in helath insurance************");
		BaseClass.getLogger().info("************Sucessfuly completed all the testCases************");
	}

}
