
package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webdriver_manager.DriverManager;

public class HomePage {
	

private static HomePage loginPageInstance;
	
	//Dummy private constructor prevents the object create
	public HomePage() {
		
	}
	
	//this method prevents duplicate object creation, Singleton pattern lazy loading
	public static HomePage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new HomePage();		
		}
		
		return loginPageInstance;
		
	}
		
//	@FindBy(className="btn") 
//	private WebElement btngetstarted;
	 @FindBy(xpath=("//button[@class='btn']"))WebElement getstarted;
	 
	public void btn_getstartedclick() {
		
	//	btngetstarted.click();
		getstarted.click();
		System.out.println("User Clicks on Get Started button Home Object  Page");
		
	}
	
	public String redirectToHomePage()
	{
		
		String title = DriverManager.getDriver().getTitle();
		return title;
	
	}

}