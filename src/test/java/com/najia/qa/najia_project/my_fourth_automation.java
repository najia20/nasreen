package com.najia.qa.najia_project;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class my_fourth_automation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		my_fourth_automation c=new my_fourth_automation();
		c.john();
	}
public void john() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	ChromeOptions obj=new ChromeOptions();
	obj.addArguments("--remote-allow-origins-*");
	WebDriver b=new ChromeDriver();
	b.get("https://www.deltadental.com/");
	Thread.sleep(5000);
	b.close();
	
}
}
