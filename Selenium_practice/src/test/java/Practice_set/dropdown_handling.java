package Practice_set;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='my-select']"));
		Select dropdowns = new Select(dropdown);
		dropdowns.selectByVisibleText("One");
		
		List<WebElement> alloptions = dropdowns.getOptions();
		for(WebElement el:alloptions) {
			System.out.println(el.getText());
		}
	}

}
