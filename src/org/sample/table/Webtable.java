package org.sample.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Raja\\Seleniumws\\SelePrac\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://s694598850.t.en25.com/e/es?s=949606000&e=246908&elqTrackId=d86efc5b73fe4f8a8edba0341fe20d49&elq=fa1e93ebee394fca85894af48b5a411f&elqaid=11706&elqat=1");
		
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			
			WebElement eachrow = tRow.get(i);
			
			List<WebElement> tData = eachrow.findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				
				WebElement text = tData.get(j);
				System.out.println(text);
			}
				
		
			
		}
		
			


			
		}
		
	}


