package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class PersonalArea  extends Page{
	 void click(WebDriver driver)throws InterruptedException {
		 WebElement myLink =driver.findElement(By.xpath("//div[@class='links_container']//a"));
			myLink.click();
			Thread.sleep(1000);
			WebElement myLink1 =driver.findElement(By.xpath("//div[@class=' status_wrapper status-dodgerblue']"));
			myLink1.click();
			Thread.sleep(1000);
			WebElement advertising =driver.findElement(By.xpath("//div[@class='adoric_element element-shape closeLightboxButton editing']"));
			advertising.click();
			Thread.sleep(4000);
			WebElement ad =driver.findElement(By.xpath("//span[@class='viewCommand viewSize1 viewCommandGreenBtn']"));
			ad.click();
			}

}
