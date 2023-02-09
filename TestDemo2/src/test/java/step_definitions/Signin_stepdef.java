package step_definitions;

import org.openqa.selenium.WebDriver;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.SigninPage;
import webdriver_manager.DriverManager;

public class Signin_stepdef {

	WebDriver driver = DriverManager.getDriver();	
	SigninPage SignPage = SigninPage.getInstance();
	
	
	@Given("User is in sigin page")
	public void user_is_in_sigin_page() {
		System.out.println("User is in Signin page 1"); 
		DriverManager.getDriver().get(Constants.SIGNIN_URL);
		//driver.manage().window().maximize(); 
		//SignPage.Singinlinkbtn();
		System.out.println("User Signin page 1");
	}

	@When("User Enters Username valid Userid")
	public void user_enters_username_valid_userid() {
	    SignPage.Enterusername("Numpysdet84"); 
	    System.out.println("User enter Username");
	}

	@When("User Enters Password valid password")
	public void user_enters_password_valid_password() {
		 SignPage.Enterpassword("sdet84batch");
		 System.out.println("User enter Password");
	}

	@When("User clicks on sigin button")
	public void user_clicks_on_sigin_button() {
		SignPage.clicklogin();
		System.out.println("User clicks_on_sigin_button");
		
	    
	}

	@Then("User Redirect to home Page")
	public void user_redirect_to_home_page() {
		 System.out.println("User in the Redirect Home Page - SignIN");
	    
	    
	}
	
	
}
