package Sample_mobile_Automation.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Build {
	
	public static AndroidDriver<MobileElement> driver;
	public void launchApp() throws InterruptedException, MalformedURLException {
		 
		 File classpathRoot = new File(System.getProperty("user.dir"));
		 File appDir = new File(classpathRoot, "/new app");
		 File app = new File(appDir, "app-QALive-debug.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("deviceName", "emulator");
		 capabilities.setCapability("platformVersion", "9");
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("appPackage", "com.freewire");
		 capabilities.setCapability("app", app.getAbsolutePath());
		 capabilities.setCapability("noRset",true);
		 capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		 capabilities.setCapability("locationServicesAuthorized", true);
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	}
	

}
