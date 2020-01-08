package org.sample.chrdri;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDisplay {
	
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement user = driver.findElement(By.id("email"));
		boolean b= user.isDisplayed();
		if(b==true) {
			System.out.println("logo is there");
		}
		else {
			System.out.println("Logo is not there");
		}
		
		WebElement checkbox = driver.findElement(By.id("u_0_6"));
		boolean a=checkbox.isEnabled();
	
		if(a==true) {
			System.out.println("check box is there");
		}
		else
		{
		System.out.println("checkbox is not there");	
		}
		
		

}
}