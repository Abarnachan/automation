package com.test.Try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test
{
public static WebDriver driver;
public static void createInstance()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vision\\Documents\\Automation\\ChormeDriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
}
}