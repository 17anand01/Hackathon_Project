package testCases;

import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.healthInsurance;


public class TC003_HEALTHINSURANCE extends BaseClass{
	
	healthInsurance hi;
	
	@Test(priority=0,groups= {"sanity"})
	public void moveTohealthInsurance() {
		hi=new healthInsurance(BaseClass.getDriver());
		BaseClass.getLogger().info("************Object for healthInsurance Page got created************");
		hi.moveToHealthInsurance();;
		
	}
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void healthInsuranceTest() {
		
		hi.moveToHealthInsurance();
		hi.healthInsuranceItems();
		BaseClass.getLogger().info("************Captured all the menu items in helath insurance************");
		BaseClass.getLogger().info("************Sucessfuly completed all the testCases************");
	}

}
