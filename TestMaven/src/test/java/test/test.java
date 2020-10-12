package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;

public class test extends TestBase{

	public test() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		init();
	}
	
	@Test()
	public void test1(){
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	/*@Test
	public void test1()
	{		 // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "D:\\PracticeWorkspace\\TestMaven\\drivers\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
		
	}*/

}
