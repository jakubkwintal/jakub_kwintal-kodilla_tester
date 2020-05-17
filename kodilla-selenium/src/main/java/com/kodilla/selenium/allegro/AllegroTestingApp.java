package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

//        //* wyłączenie alertu ver. 1
//        while (!driver.findElement(By.xpath(
//                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
//        }
//        driver.findElement(By.xpath(
//                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).click();


        //* wyłączenie alertu ver. 2
        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button"));

        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();


        //* nazwa produktu (nie można na końcu użyć inputField.submit() bo wyszuka bez wyboru kategorii
        WebElement inputField = driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/input"));
        inputField.sendKeys("Mavic mini");


        //* wybór kategorii
        driver.findElement(By.xpath("//*[@class=\"_r65gb _1fwkl\"]/select/optgroup/option[3]")).click();

        //* kliknięcie "Szukaj"
        driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/button")).click();
    }
}