package com.selenium.demo.test_addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp22j\\chrome-driver\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the application URL
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        // Your test code here
        
        
        driver.findElement(By.className("v-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Aryan");
        Thread.sleep(3000);
        driver.findElement(By.id("gwt-uid-7")).sendKeys("Pathak");
        Thread.sleep(3000);
        driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@xyz.com");
        Thread.sleep(3000);
        driver.findElement(By.id("gwt-uid-13")).sendKeys("24/05/2024");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ROOT-2521314\"]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div"));
        Thread.sleep(3000);
       
        // Close the browser
        driver.quit();
    }
}

