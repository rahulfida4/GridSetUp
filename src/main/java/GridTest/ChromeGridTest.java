package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		
		//Define Des Capabilites:------>
		DesiredCapabilities  cap =  new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//Chrome Options  definations:------>
		//Before 3.7 we don't have to defined Chrome options ,SBut from 3.7 we have to define ChromeOptions:
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = " http://192.168.0.11:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://www.freecrm.com/index.html");
		System.out.println(driver.getTitle());
		
		
		

	}

}
