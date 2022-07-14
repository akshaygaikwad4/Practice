package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {
		String chromepath="C:\\Workspace_new\\Batch_10A Selemium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://bugspotter.in/about.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.quit();

	}

}
