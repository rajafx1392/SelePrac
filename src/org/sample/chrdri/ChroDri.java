package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChroDri {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement textuserName = driver.findElement(By.id("email"));
		String pre= textuserName.getText();
	    System.out.println(pre);
		textuserName.sendKeys("rajafx1392@gmail.com");
		
		WebElement textPassWord = driver.findElement(By.id("pass"));
		String pre1= textPassWord.getText();
	    System.out.println(pre1);
		textPassWord.sendKeys("hari");
		
		WebElement buttonClick = driver.findElement(By.xpath("//input[@value='Log In']"));
		buttonClick.click();
		
		
	}

}
