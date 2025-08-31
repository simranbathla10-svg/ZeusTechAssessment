package Practice_set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

public class mouse_actions {
	public static void main (String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
		System.out.println(button.getText());
		WebElement button2 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick().build().perform();
		System.out.println(button2.getText());
		
		
	}

}
