package Practice_set;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Annotations {
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void login() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	@Test
	public void testfail() {
		System.out.println("Failed test case.");
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void testskip() {
		System.out.println("Skipped test case.");
		throw new SkipException("Skip exception thrown");
	}

	

}

