package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Script1 {
	public WebDriver driver;
	@BeforeMethod
	public void openapplc()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	

}
	@AfterMethod
	public void closeappl()
	{
		driver.close();
	}
	
}


