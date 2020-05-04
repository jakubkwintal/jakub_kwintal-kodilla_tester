package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();

//        while (driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/input")).isDisplayed()) {
//   ??????????????????????????????
//        }

        WebElement inputField = driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/input"));
        inputField.sendKeys("Mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"_r65gb _1fwkl\"]/select/optgroup"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(2);

        inputField = driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/button"));
        inputField.submit();
    }
}