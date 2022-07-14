package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver", "C:\\Workspace_new\\Batch_10A Selemium\\Drivers\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://bugspotter.in/about.html");
   driver.manage().window().maximize();
   System.out.println(driver.getTitle());
   System.out.println(driver.getCurrentUrl());
   Thread.sleep(3000);
   driver.close();
	}

}
