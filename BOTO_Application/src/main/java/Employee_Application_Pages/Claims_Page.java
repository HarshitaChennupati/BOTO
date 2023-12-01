package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Claims_Page extends Driver_Page{
	private final static By byforward=By.xpath("//li[@class='pagination-page page-item ng-star-inserted']");
	private final static By bystatus=By.xpath("(//span[contains(text(),' claim requested ')])[4]");
	private final static By byprint=By.xpath("//button[@class='btn btn-custom-bg']");
	private final static By bybacktomyclaims=By.xpath("//span[text()='My Claims ']");
	private final static By byedit=By.xpath("(//i[@class='fas fa-pen'])[4]");
	private final static By bysave=By.xpath("//button[text()=' Save ']");
	
	
	
	public static WebElement ClickOnPage2()
	{
		return driver.findElement(byforward);
	}
	public static WebElement ClickOnStatus()
	{
		return driver.findElement(bystatus);
	}
	public static WebElement ClickOnPrint()
	{
		return driver.findElement(byprint);
	}
	public static WebElement ClickOnMyClaims()
	{
		return driver.findElement(bybacktomyclaims);
	}
	public static WebElement CLickOnPenIcon()
	{
		return driver.findElement(byedit);
	}
	public static WebElement ClickOnSave()
	{
		return driver.findElement(bysave);
	}
	
	
	public static void ClickonPage2()
	{
		ClickOnPage2().click();
	}
}
