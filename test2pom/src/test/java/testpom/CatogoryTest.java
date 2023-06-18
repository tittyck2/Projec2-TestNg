package testpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddDuplicateCategory;
import pages.Catogory;
import pages.MonthCheck;
import util.BrowserFactory;

public class CatogoryTest {
	

	
	WebDriver driver;
	
	@BeforeMethod
	public void initalize() {
		
		driver = BrowserFactory.init();
	}

	@Test
	public void addCatogory() {
		
		Catogory.userShouldBeAbleToAddCatogory(driver);
		

		
	}
	
	@Test
	public void checkForMonths() {
		
		MonthCheck.monthCheck(driver);
	}
	
	@Test
	public void checkForAddingDuplicateCatogory() {
		
		AddDuplicateCategory.userShouldNotBeAbleToAddCatogory(driver);
		Assert.assertEquals(driver.findElement(By.name("categorydata")).getText(), "Tittycherian", "The category you want to add already exists");
	}
}
