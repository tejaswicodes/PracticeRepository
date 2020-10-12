package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public Properties prop;
	public WebDriver driver;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fis= new FileInputStream("D:/PracticeWorkspace/TestMaven/src/main/java/com/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void init()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D://PracticeWorkspace//TestMaven//drivers//chromedriver.exe");  
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
	}
}
