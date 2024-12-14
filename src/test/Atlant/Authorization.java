import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Authorization {
    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://atlant-68.ru/");
    }
    WebDriver driver = new ChromeDriver();
    @Test
    void authorizationFail() {
        driver.get("https://atlant-68.ru/");
        WebElement personalPage = driver.findElement(By.xpath("//a[@title='Личный кабинет']//*[name()='svg']"));
        WebElement inputLogin = driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='Войти']"));
        Actions action = new Actions(driver);
        action
                .moveToElement(inputLogin)
                .click()
                .sendKeys("Невалидный логин")
                .moveToElement(buttonLogin)
                .click()
                .build()
                .perform();
            }
        }

