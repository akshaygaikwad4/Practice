package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_handle_select {

	private static int i;

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "C:\\Workspace_new\\Batch_10A Selemium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	// droupdown
	WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	Select drp=new Select(drp_country);
//	drp.selectByIndex(4);
	Thread.sleep(2000);
//	drp.selectByValue("AMERICAN SAMOA");
	Thread.sleep(2000);
	drp.selectByVisibleText("ANTARCTICA");
	System.out.println(drp.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	
	List<WebElement> optionlist=drp.getOptions();
	System.out.println(optionlist.size()); //264 OPTIONS
	Thread.sleep(2000);
		for (int i=0;i<optionlist.size();i++);	{
	Thread.sleep(2000);		
	String option=optionlist.get(i).getText();
	System.out.println(option); 
	
		
		}
	
		drp.selectByVisibleText("ANTARCTICA");
		
		
	}

}
