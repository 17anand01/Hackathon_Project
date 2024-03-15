package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.travelInsurance;


public class TC001_TRAVELINSURANCE extends BaseClass{
	travelInsurance ti;
	@Test(priority=0,groups= {"sanity"})
	public void travelInsuranceClickTest()  {
		ti=new travelInsurance(BaseClass.getDriver());
		BaseClass.getLogger().info("************Object for travelInsurance Page got created************");
		ti.clickTravelInsurance();
		BaseClass.getLogger().info("************TravelInsurance got clicked************");
		String act_title=BaseClass.getDriver().getTitle();
		String exp_title="Travel Insurance: Buy Travel Insurance Policy Online in India 2024";
		Assert.assertEquals(act_title, exp_title);
		BaseClass.getLogger().info("************TravelInsurance Page title got verified************");
		
	}
	
	@Test(priority=1, dependsOnMethods="travelInsuranceClickTest",groups= {"sanity","regression"})
	public void travelInsuranceDateTest() {
		ti.selectDate();
		BaseClass.getLogger().info("************Date got selected************");
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void travelInsuranceSelectTwoTest() {
		ti.selectTwo();
		BaseClass.getLogger().info("************Selected two travellers************");
	}
	
	@Test(priority=3,groups= {"sanity","regression"})
	public void travelInsuranceSelectNoTest() {
		ti.selectNo();
		BaseClass.getLogger().info("************Selected No for Medical history************");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	public void travelInsuranceMobileNumTest() {
		ti.mobileNum();
		BaseClass.getLogger().info("************Mobile number entered sucessfully************");
	}
	
	@Test(priority=5,groups= {"sanity","regression"})
	public void travelInsuranceselectStudentTest() {
		ti.selectStudent();
		BaseClass.getLogger().info("************Students Plans got Selected************");
		
	}
	
	@Test(priority=6,groups= {"sanity","regression"})
	public void travelInsuranceSelectTravellerTest() {
		ti.selectTraveller();
		BaseClass.getLogger().info("************Travellers got Selected************");
		
	}
	@Test(priority=7,groups= {"sanity","regression"})
	public void travelInsuranceLowToHighTest() {
		ti.lowToHigh();
		BaseClass.getLogger().info("************Low to High filter got selected************");
		
	}
}
