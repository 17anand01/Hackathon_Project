package stepDefinitions;



import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.carInsurance;

public class carInsuranceStep {
	carInsurance ci;
	@Given("User navigate to the car insurance page")
	public void user_navigate_to_the_car_insurance_page() {
	    ci=new carInsurance(BaseClass.getDriver());
	    BaseClass.getLogger().info("************Object for carInsurance Page got created************");
	}

	@When("User clicks on to the car insurance")
	public void user_clicks_on_to_the_car_insurance() {
	   ci.clickCarInsurance();
	   BaseClass.getLogger().info("************carlInsurance got clicked************");
	   String exp="PolicyBazaar Car Insurance: Insure Your Car Today";
	   String act=BaseClass.getDriver().getTitle();
	   Assert.assertEquals(exp, act);
	   BaseClass.getLogger().info("************carlInsurance Page title got verified************");
	   
	}

	@Then("User captures the error message")
	public void user_captures_the_error_message() {
	    ci.carNum();
	    BaseClass.getLogger().info("************Captured the error message for car************");
	}

	@When("User enters the car number and clicks on to the view price button")
	public void user_enters_the_car_number_and_clicks_on_to_the_view_price_button() {
	   ci.carNumValue();
	   BaseClass.getLogger().info("************Entered the car number************");
	}

	@Then("User captures the email error message")
	public void user_captures_the_email_error_message() {
	    ci.formFill();
	    ci.clickPolicybazaar();
	    BaseClass.getLogger().info("************Captured the error message for email************");
	}

}
