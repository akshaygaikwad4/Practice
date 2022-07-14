
package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace_new\\Batch_10A Selemium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_passward=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn_login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		if (txt_email.isEnabled()==true && txt_email.isDisplayed()==true) {
			txt_email.sendKeys("test");
		}else {
			System.out.println("Element is disabled");
		}
		
		txt_email.sendKeys("akshaygaikwad453@gmail.com");
		txt_passward.sendKeys("9637701757ak");
		btn_login.click();
		driver.close();
		
		
		
		
		
		

	}

}
