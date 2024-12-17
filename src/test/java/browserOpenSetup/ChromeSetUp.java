package browserOpenSetup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeSetUp {
	
	WebDriver driver;
	
	@Test(priority=1)

		public void framehandle() throws InterruptedException {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
			//alert url open direct
			
			driver.get("https://demoqa.com/frames");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

	}
	
	
	@Test(priority=2)
	public void teardown() {
		
		
		driver.quit();
		
}
			

}