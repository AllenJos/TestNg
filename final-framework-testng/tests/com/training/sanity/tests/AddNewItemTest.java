package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddNewItemTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
		loginPOM.clickMenu();
		loginPOM.clickCatalog();
		loginPOM.clickProducts();
		loginPOM.clickAddnew();
		loginPOM.sendNewProductname("Shirt");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		loginPOM.sendMetaTitle("Shirt for girls");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		loginPOM.clickDatatab();
		loginPOM.sendInputmodel("SHG-10");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(500);
		loginPOM.sendPrice("750");
		loginPOM.sendQuantity("50");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		loginPOM.clickLink();
		loginPOM.clickCat();
		loginPOM.clickListval();
		loginPOM.clickSavebtn();
		
		
	}

}
