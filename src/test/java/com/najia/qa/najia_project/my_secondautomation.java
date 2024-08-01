package com.najia.qa.najia_project;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_secondautomation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		my_secondautomation obj=new my_secondautomation();
		obj.tom();
	}
public void tom() throws Exception {
	System.setProperty("webdriver.Chrome.Driver", "C:\\Drivers\\chromedriver.exe");
	ChromeOptions tom=new ChromeOptions();
	tom.addArguments("--remote-allow-origins-*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(10000);
	driver.close();
}
}
