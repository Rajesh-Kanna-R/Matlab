package org;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class nest {
public static void main(String[] args) throws InterruptedException, IOException {

	
	
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
 
   driver.get(" https://tms.prutechindia.com/dashboard ");
   driver.manage().window().maximize(); 
   driver.manage().deleteAllCookies();
   
	
   

 
}}

