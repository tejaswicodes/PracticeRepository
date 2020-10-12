package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fis= new FileInputStream("C://Users//Tejaswi//git//PracticeRepository//TestMaven//src//main//java//com//config//config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void init()
	{
		String url=prop.getProperty("redirect");
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C://Users//Tejaswi//git//PracticeRepository//TestMaven//drivers//chromedriver.exe");  
			driver = new ChromeDriver();
		}
	
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	}
}
