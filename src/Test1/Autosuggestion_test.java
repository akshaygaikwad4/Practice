package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_test {

	public static void main(String[] args) throws InterruptedException {
		// browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace_new\\Batch_10A Selemium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		// Send value --- Searchbar
		WebElement txt_searchbar=driver.findElement(By.xpath("//input[@ name=\'q\']"));
		txt_searchbar.sendKeys("Maven");
		Thread.sleep(3000);
		
		List<WebElement> autolist=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
		System.out.println(autolist.size());
		Thread.sleep(3000);
		
		System.out.println(autolist.get(4).getText());
		for(int i=0;i<autolist.size();i++) {
		Thread.sleep(3000);	
		String textlist=autolist.get(i).getText();
		System.out.println(textlist);
		if(textlist.equals("maven interview questions"));
		autolist.get(i).click();
		driver.close();
		
		
		
		
			
		}


	}

}
