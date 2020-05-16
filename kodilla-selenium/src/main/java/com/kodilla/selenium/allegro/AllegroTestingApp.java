package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        //* wyłączenie alertu
        while (!driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
        }
        driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).click();


        //* nazwa produktu (nie można na końcu użyć inputField.submit() bo wyszuka bez wyboru kategorii
        WebElement inputField = driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/input"));
        inputField.sendKeys("Mavic mini");


        //* wybór kategorii
        driver.findElement(By.xpath("//*[@class=\"_r65gb _1fwkl\"]/select/optgroup/option[3]")).click();

        //* kliknięcie "Szukaj"
        driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/button")).click();
    }
}