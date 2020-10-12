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
}
