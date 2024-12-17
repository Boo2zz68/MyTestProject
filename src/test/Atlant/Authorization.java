package Atlant;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Authorization extends AbstractTest {
    //static Logger logger = LoggerFactory.getLogger(Authorization.class);
    @Test
    void switchToPersonalAccount() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3))
                .until(ExpectedConditions.urlContains("https://minus417ru.com/"));
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//*[name()='path' and contains(@d,'M20.188 21')]")))
                .build()
                .perform();
        String nameHost = getDriver().getCurrentUrl();
        Assertions.assertEquals(nameHost, "https://minus417ru.com/personal/orders/");
        }
        @Test
    void successAuthorization() {
            Actions action = new Actions(getDriver());
            action
                    .click(getDriver().findElement(By.xpath("//*[name()='path' and contains(@d,'M20.188 21')]")))
                    .build()
                    .perform();
            action
                    .click(getDriver().findElement(By.xpath("//input[@name='PHONE_LOGIN_EMAIL']")))
                    .sendKeys("boo2zz75384@mail.ru")
                    .click(getDriver().findElement(By.name("PASSWORD")))
                    .sendKeys("Fehtkbz75384!")
                    .click(getDriver().findElement(By.xpath("//div[@class='bxmaker-authuserphone-enter-auth-by-password-form']//div[@class='bxmaker-authuserphone-button__inner']")))
                    .build()
                    .perform();
        }
        /*
        @Test
        void invalideLogin() throws InterruptedException {
            Actions action = new Actions(getDriver());
            action
                    .click(getDriver().findElement(By.xpath("//*[name()='path' and contains(@d,'M20.188 21')]")))
                    .build()
                    .perform();
            action
                    .click(getDriver().findElement(By.xpath("//input[@name='PHONE_LOGIN_EMAIL']")))
                    .sendKeys("Невалидный логин")
                    .click(getDriver().findElement(By.xpath("//div[@class='bxmaker-authuserphone-enter-auth-by-password-form']//div[@class='bxmaker-authuserphone-button__inner']")))
                    .pause(3000)
                    .build()
                    .perform();
            Thread.sleep(5000);
            String textError = getDriver().findElement(By.xpath("//div[@class='bxmaker-authuserphone-enter-auth-by-password-form']//div[@class='bxmaker-authuserphone-message bxmaker-authuserphone-message--error'][contains(text(),'Не указан пароль')]")).getAttribute("outerText");
            Assertions.assertEquals(textError, "Не указан пароль");
        }

         */
    }



