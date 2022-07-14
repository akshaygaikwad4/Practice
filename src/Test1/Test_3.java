


package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

	public static void main(String[] args) throws InterruptedException {
		
		String Path="C:\\Workspace_new\\Batch_10A Selemium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("akshaygaikwad453@gmail.com");
		
		WebElement txt_passward=driver.findElement(By.name("pass"));
		txt_passward.sendKeys("9637701757ak");
		WebElement btn_login=driver.findElement(By.id("loginbutton"));
		btn_login.click();
		
		driver.close();
		
		
		
		

	}

}
