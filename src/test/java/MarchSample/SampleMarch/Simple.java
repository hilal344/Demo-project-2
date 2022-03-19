package MarchSample.SampleMarch;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple {
	WebDriver driver;
@Test
public void Google() {
	
}
@Test
public void Search() throws InterruptedException {
	driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("abdullah hilal");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/*[1]")).click();
	Thread.sleep(5000);
}
@BeforeMethod
public void OpenBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABDULLAH\\eclipse-workspace\\\\SampleMarch\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.google.com/");
	Thread.sleep(5000);
}
@AfterMethod
public void Close() {
	driver.close();
}
}
