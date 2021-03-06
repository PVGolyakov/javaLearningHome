package ru.alfabank.pgolyakov2;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Objects;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;


/**
 * Created by Pavel on 27.09.2017.
 */
public class LearnSelenium {
    LearnSelenium learnSelenium;
    static WebDriver driver;
    @BeforeClass
    public static void openBrowser () {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Pavel\\Downloads\\selenium-drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }


   @Test
   public void shouldCheckCardName() throws InterruptedException {

       //заходим на сайт АБ и переходим в карты
       driver.get("https://alfabank.ru/");
       sleep(2000);
       WebElement findBancCard = driver.findElement(By.xpath
               ("//*[@id=\"home_page\"]/div[1]/div[1]/div/div/div[4]/ul[1]/li[2]/a"));
       findBancCard.click();
       sleep(4000);

       //Выбор дебетовой карты
       WebElement clickDebetCard = driver.findElement(By.xpath
               ("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/a"));
       clickDebetCard.click();
       sleep(4000);

       //Выбор МастерКард и тип Классик
       WebElement clickMasterCard = driver.findElement(By.xpath
               ("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div/form/div/div[3]/div/div/div/div[1]/label"));
       clickMasterCard.click();

       WebElement clickClassic = driver.findElement(By.xpath
               ("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div/form/div/div[4]/div/div/div/div[1]/label"));
       clickClassic.click();
       sleep(4000);

       WebElement checkCard = driver.findElement(By.xpath
               ("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[6]/div/div[3]/h3/a"));

       String expectedTitle = "Карта «Перекресток»";
       assertEquals(expectedTitle, checkCard.getText()); //сравнение что ожидали и что получили.
    }
    @AfterClass
    public static void closeBrowser () {
        driver.close();
    }
}
