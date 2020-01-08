package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
	    WebElement signUp = driver.findElement(By.xpath("//a[contains(@class,'r2iyh')]"));
		signUp.click();
		
		 WebElement phoNo = driver.findElement(By.id("mobile"));
		    phoNo.sendKeys("8012072850");
		    
		    WebElement name = driver.findElement(By.id("name"));
		    name.sendKeys("Raja");
		    
		    WebElement emailId = driver.findElement(By.id("email"));
		    emailId.sendKeys("rajafx1293");
		    
		    WebElement passWord = driver.findElement(By.id("password"));
		    passWord.sendKeys("rajafx1293");
		    
		    WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		    submit.click();
		    
		  
		
	}

}
