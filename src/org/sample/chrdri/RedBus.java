package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
	    from.sendKeys("Tenkesi");
	    
	    WebElement to = driver.findElement(By.id("dest"));
	    to.sendKeys("Chennai");
	    
	    WebElement search = driver.findElement(By.id("search_btn"));
	    String text= search.getText();
	    System.out.println(text);
	    
	    search.click();
	    
	   

}
}
