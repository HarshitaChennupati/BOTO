package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_Page extends Driver_Page{
	private final static By bymenuicon=By.cssSelector("div[class='sidenav-toggler d-none d-xl-block']");
	private final static By bydashboard=By.cssSelector("i[class='fa-home fas ni purple1']");
	private final static By bymenu=By.cssSelector("div[class='sidenav-toggler-inner']");
	private final static By byinsurenceCard=By.xpath("//h2[contains(@class,'mb-0 policy-name')]");


	public static WebElement ClickOnMenu()
	{
		return driver.findElement(bymenuicon);
	}
	public static WebElement ClickOnDashboardIcon()
	{
		return driver.findElement(bydashboard);
	}
	public static WebElement ClickOnmenu()
	{
		return driver.findElement(bymenu);
	}
	public static WebElement ClickOnInsuranceCard()
	{
		return driver.findElement(byinsurenceCard);
	}


	public static void ClickonMenuIcon()
	{
		ClickOnMenu().click();
	}
	public static void ClickOnDashboard()
	{
		ClickOnDashboardIcon().click();
	}
	public static void ClickOnMenuButton()
	{
		ClickOnmenu().click();
	}
	public static void ClickOnCard() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnInsuranceCard().click();
	}
}
