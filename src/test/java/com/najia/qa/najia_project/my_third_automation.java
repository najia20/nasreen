package com.najia.qa.najia_project;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_third_automation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		my_third_automation a=new my_third_automation();
		a.tom();
	}
public void tom() throws Exception {
	System.setProperty("webdriver.Chrome.driver", "C:\\Drivers\\chromedriver.exe");
	ChromeOptions obj=new ChromeOptions();
	obj.addArguments("--remote-allow-origins-*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.deltadental.com/");
	Thread.sleep(1000000);
	driver.close();
}
}
