package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.iN ");
		Actions a = new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//a[reef=’javascript:void(0);’]"));
		 a.moveToElement(mobile).perform();
		WebElement clk=driver.findElement(By.xpath("//a[@target=’blank’]"));
		clk.click();
		driver.close();
	}

}
