package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahootest {
  WebDriver driver;
	@Before
	public void setUp() throws Exception {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test01() {
		driver.get("https://in.yahoo.com/?p=us");
		System.out.println(driver.getTitle());
	}

}
