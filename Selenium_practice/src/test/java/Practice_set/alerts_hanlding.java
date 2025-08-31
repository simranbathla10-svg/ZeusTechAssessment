package Practice_set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_hanlding {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().dismiss();
	}

}
