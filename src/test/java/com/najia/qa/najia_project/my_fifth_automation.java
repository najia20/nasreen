package com.najia.qa.najia_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class my_fifth_automation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		my_fifth_automation d=new my_fifth_automation();
		d.diya();
	}
public void diya() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	ChromeOptions b=new ChromeOptions();
	b.addArguments("--remote-allow-origins-*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/results?search_query=how+to+download+chrome+driver+for+124+google+chrome");
Thread.sleep(2000);
driver.close();
}


}
