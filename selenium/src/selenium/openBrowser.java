package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {

	public static void main(String[] args) throws InterruptedException {
		OpenPage openPage=new OpenPage();
		EnterPage enterPAge= new EnterPage();
		PersonalArea personalArea=new PersonalArea();
		// TODO Auto-generated method stub
		System.setProperty("web.chrome.driver", "C:\\Users\\sara zolo\\eclipse-workspace\\selenium\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yad2.co.il/");
		Thread.sleep(2000);
		openPage.click(driver);
		enterPAge.click(driver);
		personalArea.click(driver);
		
	

	}

}
