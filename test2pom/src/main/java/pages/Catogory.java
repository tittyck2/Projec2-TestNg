package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BasePage;

public class Catogory {
	WebDriver driver;

	public static void userShouldBeAbleToAddCatogory(WebDriver driver) {
		
		WebElement catogTest = driver.findElement(By.name("categorydata"));
		catogTest.sendKeys("Tittycherian"+ BasePage.generateRandomNumber());
		WebElement clickon = driver.findElement(By.xpath("//*[@id=\"extra\"]/input[2]"));
		clickon.click();
	}

}
