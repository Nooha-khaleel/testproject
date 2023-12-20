package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{
WebDriver driver;

@BeforeTest
public void setup()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.meesho.com/");
	driver.manage().window().maximize();
	
}
@AfterTest
public void aftertest()
{
	
}
}
