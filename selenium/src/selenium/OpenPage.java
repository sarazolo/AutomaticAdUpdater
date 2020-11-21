package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class OpenPage extends Page {
	 void click(WebDriver driver) throws InterruptedException {
			WebElement myAccaunt=
					driver.findElement(By.xpath("//ul[@class='ul_sticky_left']/li[@class='no_sub_menu private_zone desktop_only']/a"));
			myAccaunt.click();
			Thread.sleep(2000);
			}
}
