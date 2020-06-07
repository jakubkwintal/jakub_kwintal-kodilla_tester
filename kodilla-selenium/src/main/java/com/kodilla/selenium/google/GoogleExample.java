package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com");

        WebElement inputField1 = driver1.findElement(By.name("q"));
        inputField1.sendKeys("Kodilla");
        inputField1.submit();

        System.setProperty("webdriver.gecko.driver", "C:\\selenium-drivers\\Firefox\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.google.com");

        WebElement inputField2 = driver2.findElement(By.name("q"));
        inputField2.sendKeys("U2");
        inputField2.submit();

    }
}
