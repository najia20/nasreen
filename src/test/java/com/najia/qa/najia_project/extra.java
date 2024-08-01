package com.najia.qa.najia_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class extra {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		extra obj=new extra();
		obj.tom();
	}
	public  void tom() throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeOptions tom=new ChromeOptions();
		tom.addArguments("--remote-allow-origins-*");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	//Thread.sleep(100000);
	driver.findElement(By.linkText("Contact")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("recipient-email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("recipient-name")).sendKeys("najia");
	driver.findElement(By.id("message-text")).sendKeys("hello");
		Thread.sleep(3000);
		driver.close();
}
}
