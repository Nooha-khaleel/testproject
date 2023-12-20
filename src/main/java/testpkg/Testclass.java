package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Pageclass;

public class Testclass extends Baseclass
{

	WebDriver driver;
	
	@Test
	public void test() 
	{
		Pageclass pg=new Pageclass(driver);
		 
		pg.searchbtn();
		pg.navigateback();
		pg.task();
		pg.search1();
		pg.tasks1();
		pg.scrolldown();
		
		pg.whiteshoes();
		pg.clearsearch();
		
		pg.search2();
		pg.tasks2();
		
		pg.gotocart();
		pg.navigateback();
		pg.scrolldown();
		pg.titleverification();
	}
}
