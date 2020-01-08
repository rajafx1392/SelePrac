package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Haripractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
			Actions a = new Actions(driver);
			WebElement shop = driver.findElement(By.id("attribute value"));

	             a.moveToElement(shop).perform();

			WebElement mobile = driver.findElement(By.id("attribute value "));
	a.moveToElement(mobile).perform();

	WebElement clk = driver.findElement(By.id(""));
	clk.click();

			driver.close();
		

		
		
		
		
		
		
		
				
	
	}

}
