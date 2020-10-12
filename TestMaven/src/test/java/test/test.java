package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class test extends TestBase{

	HomePage home;
	public test() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		init();
		 home = new HomePage();
	}
	
	@Test()
	public void test1(){
		try{
		home.validateTitle();
		System.out.println(home.validateTitle());
		Thread.sleep(2000);
		home.signInButton();
		Thread.sleep(2000);
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
