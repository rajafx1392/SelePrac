package org.sample.chrdri;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDisplay {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("//div[@class='_3dGepu']"));
		
		boolean a= login.isDisplayed();
		if(a==true) {
			System.out.println("logo is there");
		}
		else {
			System.out.println("logo is not there");
		
		}
		
		WebElement txtbox = driver.findElement(By.xpath("//input[@value='bbbcbc']"));
		
boolean b= txtbox.isSelected();

if(a==true) {
	System.out.println("text is there");
}
else {
	System.out.println("text is not there");

}

}
}