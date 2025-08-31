package Practice_set;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> hyperlinkscount = driver.findElements(By.tagName("a"));
		System.out.println("count: "+ hyperlinkscount.size());
		
		for(WebElement el:hyperlinkscount) {
			String url = el.getAttribute("href");
			if(url == null && url.isEmpty()) {
				System.out.println("Link can be checked");
				continue;
			}
			
		
		try {
			URL urls = new URL(url);
			HttpURLConnection huc = (HttpURLConnection) urls.openConnection();
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(url + " broken link");
			}
			else {
				System.out.println(url + "not a broken link");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		   }		
		}			
	}
}
