package minus417;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    private static WebDriver driver;
    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @BeforeEach
    void goTo() {
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://minus417ru.com/"));
    }
    @AfterAll
    public static void teatDown() {
        try {
            Thread.sleep(4000);
            //В конце закрываем браузер
            driver.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            //Выключаем driver
            driver.quit();
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }

}
