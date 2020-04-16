package Base.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	public static WebDriver driver;

	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	public void login() {
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.name("userid")).sendKeys("upender.ramidi.urr@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Upender@1");
		driver.findElement(By.id("sgnBt")).click();
	}

	public void logout() {
		//here u can write ur logout logic

	}

	public void closebrowse() {
		driver.close();
	}

}