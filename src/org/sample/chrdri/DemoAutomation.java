package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@type='text'][1]"));
	    firstName.sendKeys("Raja");
	    
	    WebElement lastName = driver.findElement(By.xpath("//input[@type='text'][2]"));
	    lastName.sendKeys("Esakki");
	    
	    WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
	    emailId.sendKeys("rajafx1392");
	    
	    WebElement phoneNo = driver.findElement(By.xpath("//input[@type='tel']"));
	    phoneNo.sendKeys("8012072850");
	    
	    WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
	    gender.click();
	    
	    WebElement hobbies = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    hobbies.click();
	    
	    WebElement skills = driver.findElement(By.xpath("//select[@type='text'][1]"));
	    skills.click();
	    
	    WebElement country = driver.findElement(By.xpath("//select[@type='text'][2]"));
	    country.click();
	    
	    WebElement passWord = driver.findElement(By.id("firstpassword"));
		passWord.sendKeys("Esakkiraja");
		
		WebElement confirmPassWord = driver.findElement(By.id("secondpassword"));
		confirmPassWord.sendKeys("Esakkiraja");
		
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();		

	}

}
