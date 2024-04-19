package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //Подключаем скаченный экземпляр веб драйвера для Хрома
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Пользователь\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Создаем экземпляр класса веб драйвер
        WebDriver driver = new ChromeDriver();
        //Пример: задаем явные ожидания 10с - ждем пока элемент мог не прогрузиться на странице
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Пример: неявные ожидания на примере конкретного элемента
        //Создаем экземпляр, создаем новый элемент
        //WebElement elementTime = (new WebDriverWait(driver, Duration.ofSeconds(10))
                //Метод для ожидания - что именно мы ожидаем? В нашем примере - появление элемента
        //        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='woodmart-nav-link'])[31]"))));

        //Теперь можно обращаться к драйверу
        //Например, перейти на соответствующий урл
        driver.get("https://icity-store.ru/");
        //Переменная, где храним ссылку на элемент
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
        //Получить свойство элемента и запишем его в переменную
        String par = element.getAttribute("clientHeight");
        String par1 = element.getAttribute("href");
        //Выведем их на экран
        System.out.println(par + " " + par1);
        //Действие с элементом
        element.click();
        //В конце закрываем браузер
        driver.close();

    }
}