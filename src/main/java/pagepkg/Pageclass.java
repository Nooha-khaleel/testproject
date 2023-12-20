package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basepkg.Baseclass;


public class Pageclass extends Baseclass
{
	
	WebDriver driver;

@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/input")
WebElement searchfield ;
//search saree and navigate
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[5]")
WebElement men;
//click men

//scrolldown
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p")
WebElement Jewellery;


//search shoes
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
WebElement searchbtn;


//tasks1
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[3]/div[2]/div[2]/div/div[1]/a/div/div[1]/img")
WebElement firstshoe;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[2]/div[2]/div/div/span[1]/span")
WebElement ind8;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")
WebElement addtocart;




//whiteshoes
@FindBy(xpath="//*[@id=\"__next\"]/div[4]/div/div/div/div[3]/div/div[2]/a/div/div[1]/img")
WebElement secondshoes;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[2]/div[2]/div/div/span[2]/span")
WebElement ind4;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")
WebElement addcart;


//clearsearchbtn
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/div[2]/svg/path")
WebElement crossbtn;


//searchkids
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
WebElement search;

//task2
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[3]/div[2]/div[2]/div/div[3]/a/div/div[2]/div[2]")
WebElement smartwatch;
@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")
WebElement add;


//gotocart
@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/a/div/span")
WebElement cart;

//click jewellery

public Pageclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this );
}



public void searchbtn()
{
	searchfield.sendKeys("saree");
	
}

public void navigateback()
{
	driver.navigate().back();
}

public void task()
{
	men.click();
	
}

public void search1()
{
	searchbtn.sendKeys("shoes");
	
}

public void tasks1()
{
	
	firstshoe.click();
	ind8.click();
	addtocart.click();
	
}

//scrolldown


public void whiteshoes()
{
	secondshoes.click();
	ind4.click();
	addcart.click();
}

public void clearsearch()
{
	crossbtn.click();
}

public void search2()
{
	search.sendKeys("kids");
	
}

public void tasks2()
{
	smartwatch.click();
	add.click();
}

public void gotocart()
{
	cart.click();
}

public void scrolldown()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollby(0,1000)","");
	
}

public void titleverification()
{
	String Actualtitle = "https://www.meesho.com/";
	String expectedtitle=driver.getTitle();
	Assert.assertEquals(Actualtitle, expectedtitle);
	
}


}