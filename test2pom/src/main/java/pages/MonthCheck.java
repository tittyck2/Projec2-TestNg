package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MonthCheck {
	WebDriver driver;
	
	
	public static void monthCheck(WebDriver driver)
	{
	WebElement dropDown = driver.findElement(By.name("due_month"));
	
	Select select = new Select(dropDown);
	List<WebElement> options = select.getOptions();
	ArrayList<String> months = new  ArrayList<>();
	for(WebElement we : options)
	    months.add(we.getText());
	System.out.println("Current list of months: " +months);
	}
}
