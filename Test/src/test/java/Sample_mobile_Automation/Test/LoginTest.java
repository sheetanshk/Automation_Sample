package Sample_mobile_Automation.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;


public class LoginTest extends Build {
  
	
	
	@Test(priority=1,description="Verify login functionality of the application")	
	public void Valid_Login() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txt_log_in")).click();
		driver.findElement(By.id("edt_username")).sendKeys("Zoya.19");
		MobileElement fwd = (MobileElement) driver.findElementById("img_forward_arrow");
		fwd.click();
		driver.findElement(By.id("edt_username")).sendKeys("Simform.123");
		fwd.click();
		Thread.sleep(5000);
		MobileElement Menu_disp = (MobileElement) driver.findElementById("com.freewire:id/img_menu");
		Menu_disp.click();
		AssertJUnit.assertTrue(Menu_disp.isDisplayed());
	}
	
	
	
}
