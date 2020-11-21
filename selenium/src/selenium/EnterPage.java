package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class EnterPage extends Page{
	 void click(WebDriver driver)throws InterruptedException {
	WebElement userName= driver.findElement(By.xpath("//input[@id='userName']"));
	userName.sendKeys("sarazolo30@gmail.com");
	Thread.sleep(1000);
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("zolo2812");
	Thread.sleep(1000);
	WebElement submit=driver.findElement(By.xpath("//input[@id='submitLogonForm']"));
	submit.click();
	Thread.sleep(1000);
	}
			
	 }
