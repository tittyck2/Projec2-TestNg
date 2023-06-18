package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDuplicateCategory {
	
	WebDriver driver;

	public static void userShouldNotBeAbleToAddCatogory(WebDriver driver) {
		
		WebElement catogTest = driver.findElement(By.name("categorydata"));
		catogTest.sendKeys("Tittycherian");
		WebElement clickon = driver.findElement(By.xpath("//*[@id=\"extra\"]/input[2]"));
		clickon.click();
		
		
	}

}
