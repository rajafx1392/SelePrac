package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstechnologys.com/contact.php");
		
		WebElement textuserName = driver.findElement(By.name("name"));
		textuserName.sendKeys("Hari");
		
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("raja1392@gmail.com");
		
		WebElement phoneNO = driver.findElement(By.name("phone"));
		phoneNO.sendKeys("8012072850");		
		
		WebElement selectCource = driver.findElement(By.xpath("//option[@value='JAVA/J2EE']"));
		selectCource.click();
		
		WebElement branch = driver.findElement(By.xpath("//option[@value='OMR']"));
		branch.click();
		
		WebElement planToStart = driver.findElement(By.xpath("//option[@value='In 2 Weeks']"));
		planToStart.click();
		
		
}

}
