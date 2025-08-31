package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	//constructor
	LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); //diff in withpagefactorymodel
	}
	
	//locators
	//By name = By.name("username");
	//By password = By.name("password");
	//By login = By.xpath("//button[normalize-space()='Login']");
	@FindBy(name = "username") WebElement username1;
	@FindBy(name = "password") WebElement pass;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement button;
	
	//Action methods
	/*public void setusername(String username) {
		driver.findElement(name).sendKeys(username);		
	}
	public void setpassword(String pass) {
		driver.findElement(password).sendKeys(pass);		
	}
	public void loginbutton() {
		driver.findElement(login).click();
	}*/
	
	public void setusername(String username) {
		username1.sendKeys(username);		
	}
	public void setpassword(String password) {
		pass.sendKeys(password);		
	}
	public void button() {
		button.click();	
	}
	
	

}
