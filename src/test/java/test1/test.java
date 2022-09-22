package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	
		public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.youtube.com/");
	}
	}


