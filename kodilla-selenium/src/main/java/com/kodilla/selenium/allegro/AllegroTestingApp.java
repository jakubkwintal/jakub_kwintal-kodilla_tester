package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

//       wyłączenie alertu ver. 2
        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button"));

        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();


        // nazwa produktu (nie można na końcu użyć inputField.submit() bo wyszuka bez wyboru kategorii
        WebElement inputField = driver.findElement(By.cssSelector("input[class*='_d25db']"));
        inputField.sendKeys("Mavic mini");


        // wybór kategorii
        driver.findElement(By.xpath("//*[@class=\"_d25db_ZZIhH _1h7wt _k70df m7er_k4 m7er_wn\"]/optgroup/option[3]")).click();

        // kliknięcie "Szukaj"
        driver.findElement(By.cssSelector("form[class*='_1h7wt'] > button")).click();

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));

        System.out.println(elements.get(0).getText());
        System.out.println("------------------------------");
        System.out.println(elements.get(4).getText());
        System.out.println("------------------------------");
        System.out.println(elements.get(6).getText());
        System.out.println("------------------------------");
    }
}

//        //* wyłączenie alertu ver. 1
//        while (!driver.findElement(By.xpath(
//                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
//        }
//        driver.findElement(By.xpath(
//                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).click();