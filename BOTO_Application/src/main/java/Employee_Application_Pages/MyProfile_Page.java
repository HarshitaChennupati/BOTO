package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularButtonText;

public class MyProfile_Page extends Driver_Page{
	private final static By byprofile =By.cssSelector("span[class='avatar avatar-sm rounded-circle']");
    private final static By bymyprofile=By.xpath("//span[text()='My profile']");
    private final static By bychangepassword=By.xpath("//button[contains(@type,'button')]");
	private final static By byoldpassword=By.xpath("//input[contains(@placeholder,'Old Password')]");
	private final static By bynewpassword=By.xpath("//input[contains(@placeholder,'New Password')]");
	private final static By bysubmiticon=ByAngularButtonText.xpath("//button[@class='btn btn-custom-bg']");
	private final static By bylogout=By.xpath("//span[text()='Logout']");
	
	
	
	public static WebElement ClickProfile()
	{
		return driver.findElement(byprofile);	
	}
	public static WebElement ClickOnmyprofiletext()
	{
		return driver.findElement(bymyprofile);
	}
	public static WebElement ClickOnButton()
	{
		return driver.findElement(bychangepassword);
	}
	public static WebElement ClickOnOldpassword()
	{
		return driver.findElement(byoldpassword);
	}
	public static WebElement ClickOnNewpassword()
	{
		return driver.findElement(bynewpassword);
	}
	public static WebElement ClickOnSubmit()
	{
		return driver.findElement(bysubmiticon);
	}
	public static WebElement ClickOnLogOut()
	{
		return driver.findElement(bylogout);
	}
	
	
	
	public static void ClickOnProfile()
	{
		ClickProfile().click();
	}
	public static void ClickOnMyprofile()
	{
		ClickOnmyprofiletext().click();
	}
	public static void ClickOnChangePassword() throws InterruptedException
	{
		Thread.sleep(10000);
		ClickOnButton().click();
	}
	public static void EnterOldPassword()
	{
		ClickOnOldpassword().click();
		ClickOnOldpassword().sendKeys("123456aA");
	}
	public static void EnterNewPassword()
	{
		ClickOnNewpassword().click();
		ClickOnNewpassword().sendKeys("123456aA");
	}
	public static void ClickOnSubmitButton()
	{
		ClickOnSubmit().click();
	}
	public static void ClickOnLogOutIcon()
	{
		ClickOnLogOut().click();
	}
}
