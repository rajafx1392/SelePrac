package org.sample.chrdri;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartrobot {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	

	WebElement login = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
	login.click();
	
	WebElement user = driver.findElement(By.xpath("(//div[@class='_39M2dM JB4AMj'])[1]"));
	user.sendKeys("rajafx1392");

	Actions a= new Actions(driver);
	
	a.doubleClick(user);
	
	Robot r= new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	WebElement paste = driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj'][2]"));
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	

}
}