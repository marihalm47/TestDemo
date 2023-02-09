package step_definitions;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.HomePage;
import webdriver_manager.DriverManager;

public class home_stepdef {

	HomePage homePageobj = HomePage.getInstance();
	@Given("User opens DS Algo portal link")
	public void user_opens_ds_algo_portal_link() {
		DriverManager.getDriver().get(Constants.APP_URL);
		DriverManager.getDriver().manage().window().maximize();
		System.out.println("User is in DS Algo portal link");
	}

	@When("User clicks {string} button")
	public void user_clicks_button(String string) throws InterruptedException {
		homePageobj.btn_getstartedclick();
		System.out.println("User is in DS Algo portal link - btn_getstartedclick");
	}

	@Then("User will be redirected to homepage")
	public void user_will_be_redirected_to_homepage() {
		System.out.println("User is in redirected to homepage");  
	   
	}

}
