package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver_manager.DriverManager;

public class SigninPage {

	private static SigninPage loginPageInstance;	
	//Dummy private constructor prevents the object creation
	public SigninPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);	
	}
	//this method prevents second object creation for the same type, Singleton pattern lazy loading
	public static SigninPage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new SigninPage();		
		}
		
		return loginPageInstance;
			
	}	
	
	
	@FindBy (linkText=("Sign in")) WebElement Signinlink;
	
	@FindBy (id="id_username") private WebElement txt_username;
	
	@FindBy (id="id_password") WebElement txt_password;
	
	@FindBy (xpath="//input[@value=\"Login\"]") WebElement lin_login;
	
	public void Singinlinkbtn()
	{
		Signinlink.click();
	}
	public void Enterusername(String Uname) {
		txt_username.sendKeys(Uname);
	}
	
	public void Enterpassword(String Upassword) {
		txt_password.sendKeys(Upassword);	
	}
	
	public void clicklogin() {
		lin_login.click();
	}
}
