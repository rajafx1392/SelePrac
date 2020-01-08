package org.sample.chrdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMI3_iI_Pay5gIVwo-PCh3DYwUSEAAYASAAEgK7bPD_BwE&ef_id=EAIaIQobChMI3_iI_Pay5gIVwo-PCh3DYwUSEAAYASAAEgK7bPD_BwE:G:s&s_kwcid=AL!739!3!339091972992!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_googa");
		
		WebElement signUp = driver.findElement(By.xpath("//a[@type='Login & Signup']"));
		signUp.click();
		
		WebElement emailId = driver.findElement(By.className("_2zrpKA _1dBPDZ"));
		emailId.sendKeys("8012072850");
		
		WebElement passWord = driver.findElement(By.className("_2zrpKA _3v41xv _1dBPDZ"));
		passWord.sendKeys("raja1992");
		
		WebElement logIn = driver.findElement(By.className("_2AkmmA _1LctnI _7UHT_c"));
		logIn.click();
		
		
	}

}
