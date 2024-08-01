package com.najia.qa.najia_project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.driver;


public class myfirstautomation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		myfirstautomation obj=new myfirstautomation();
		obj.tom();
	}
public  void tom() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	ChromeOptions tom=new ChromeOptions();
	tom.addArguments("--remote-allow-origins-*");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Contact")).click();
	Thread.sleep(100000);
	driver.close();
	
	
}

}
