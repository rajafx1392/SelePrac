package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions a= new Actions(driver);
		
		WebElement s= driver.findElement(By.id("fourth"));
		
		WebElement d= driver.findElement(By.id("amt7"));
		
		a.dragAndDrop(s, d).perform();
		
		WebElement o= driver.findElement(By.id("amt8"));
		
		a.dragAndDrop(s, o).perform();

				
	}
}
