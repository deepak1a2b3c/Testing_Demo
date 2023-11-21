package com.selenium;
public class Demoselenium {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\AllWebDriver_selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver("https://techpub-connect-demo.netlify.app/html/contactus.html");
		driver.getkey();
		driver.getTitle();
		driver.getkeyName();
		driver.getpropertyName();
		driver.setKey();
		driver.getKey();
		//select Data according to given webside name
	driver.selectbyName();
	// selectting data by type
	driver.selectbyType();
	// here webside logo testing
	driver.selectById("style=\"display: none;\"");
	// testing webside 
	driver.selectByClass("x-ua-compatible");
	// contact by select by class
	driver.selectByClass("page-title mb-25 text-white");
	
	}
}