package Practice_set;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_link_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/image_upload/index.php");
		List<WebElement> images = driver.findElements(By.tagName("a"));
		System.out.println(images.size());
		
		

	}

}
