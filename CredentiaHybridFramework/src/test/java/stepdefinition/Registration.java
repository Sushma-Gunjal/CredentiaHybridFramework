package stepdefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.RegistrationPage;
import Utilities.WebdriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Registration {

	WebDriver driver;
	
	RegistrationPage regpage = new RegistrationPage(driver);

	
	
	@Given("when canidate launch url")
	public void when_canidate_launch_url() {
	
		WebdriverUtils.launchbrowser();
		
	
		
	}

	@Given("Provide values to all the fields")
	public void provide_values_to_all_the_fields() {
		regpage.enterFirstname("Seema")
		       .selectState("lowa");
		
		
		
	}

	@Given("submit an registration form")
	public void submit_an_registration_form() {
	  
	}

	@Then("successfully candidate register to an application")
	public void successfully_candidate_register_to_an_application() {
	
	}

	@Given("candidate is on login page")
	public void candidate_is_on_login_page() {
	  
	}

	@Given("provides <Username> and <password>")
	public void provides_username_and_password() {
	   
	}

	@Given("click on login button")
	public void click_on_login_button() {

	}

	@Then("canidate successfully logged")
	public void canidate_successfully_logged() {
	 
	}
}
