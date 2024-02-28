package stepDefinitions;



import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.travelInsurance;

public class travelInsuranceStep {
	travelInsurance ti;
	@Given("User navigates to the travel insurance page")
	public void user_navigates_to_the_travel_insurance_page() {
	    ti=new travelInsurance(BaseClass.getDriver());
	    BaseClass.getLogger().info("************Object for travelInsurance Page got created************");
	}

	@When("User selects the location and select the date")
	public void user_selects_the_location_and_select_the_date() {
	    ti.clickTravelInsurance();
	    BaseClass.getLogger().info("************TravelInsurance got clicked************");
	    String act_title=BaseClass.getDriver().getTitle();
		String exp_title="PolicyBazaar Travel Insurance";
		Assert.assertEquals(act_title, exp_title);
		BaseClass.getLogger().info("************TravelInsurance Page title got verified************");
	    ti.selectDate();
	    BaseClass.getLogger().info("************Date got selected************");
	}

	@When("User selects two travellers and selects no button")
	public void user_selects_two_travellers_and_selects_no_button() {
	    ti.selectTwo();
	    BaseClass.getLogger().info("************Selected two travellers************");
	    ti.selectNo();
	    BaseClass.getLogger().info("************Selected No for Medical history************");
	}

	@When("User enters the mobile number")
	public void user_enters_the_mobile_number() {
	   ti.mobileNum();
	   BaseClass.getLogger().info("************Mobile number entered sucessfully************");
	}

	@When("User selects the student and selects the traveller")
	public void user_selects_the_student_and_selects_the_traveller() {
		ti.selectStudent();
		BaseClass.getLogger().info("************Students Plans got Selected************");
		ti.selectTraveller();
		BaseClass.getLogger().info("************Travellers got Selected************");
	}

	@Then("Displays the first three travel insurance plan")
	public void displays_the_first_three_travel_insurance_plan() {
	    ti.lowToHigh();
	    BaseClass.getLogger().info("************Low to High filter got selected************");
	}

}
