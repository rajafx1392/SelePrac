
package org.sample.chrdri;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoer {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions a= new Actions(driver);
		
		WebElement men= driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']"));
        a.moveToElement(men).perform();
        
        
        WebElement clik= driver.findElement(By.xpath("//a[@title='T-Shirts']"));
        clik.click();
		
	}
}
