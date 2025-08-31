package Practice_set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class product_page {
	SoftAssert softassert = new SoftAssert();

		public WebDriver driver;
		@BeforeTest
		public void setup1() {
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		@Test
		public void verifytitle() {
			
			softassert.assertEquals(driver.getTitle(), "Swag Labs");
		}
		@AfterTest
		public void close() {
			driver.close();
		}
	}


