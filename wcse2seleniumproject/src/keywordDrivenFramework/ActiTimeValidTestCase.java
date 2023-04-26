package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"password"));
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		bt.tearDown();
	}
}
