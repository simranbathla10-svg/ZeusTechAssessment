package Practice_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.findElement(By.tagName("a")).click();
		System.out.println(driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
		List<String> windowhandles = new ArrayList<String>();
		handles.addAll(windowhandles);
		
		driver.getCurrentUrl();
		driver.close();
		
		driver.switchTo().window(windowhandles.get(0));
		System.out.println(driver.getTitle());
				
	}

}
