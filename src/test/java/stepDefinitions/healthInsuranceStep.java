package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.healthInsurance;

public class healthInsuranceStep {
	healthInsurance hi;
	@Given("User navigates to the home page")
	public void user_navigates_to_the_home_page() {
	   hi=new healthInsurance(BaseClass.getDriver());
	   BaseClass.getLogger().info("************Object for healthInsurance Page got created************");
	}

	@When("User hover to the health insurance")
	public void user_hover_to_the_health_insurance() {
	   hi.moveToHealthInsurance();
	   BaseClass.getLogger().info("************Moved to health insurance************");
	}

	@Then("User displays submenus of health insurance")
	public void user_displays_submenus_of_health_insurance() {
	    hi.healthInsuranceItems();
	    BaseClass.getLogger().info("************Captured all the menu items in helath insurance************");
	}



}
