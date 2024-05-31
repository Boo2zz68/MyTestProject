package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //Подключаем скаченный экземпляр веб драйвера для Хрома
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Пользователь\\Downloads\\chromedriver-win64-(1)\\chromedriver-win64\\chromedriver.exe");
        //Создаем экземпляр класса веб драйвер
        WebDriver driver = new ChromeDriver();
        //Пример: задаем явные ожидания 10с - ждем пока элемент мог не прогрузиться на странице
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Изменение параметров экрана - полный
        driver.manage().window().maximize();
        //Пример: неявные ожидания на примере конкретного элемента
        //Создаем экземпляр, создаем новый элемент
        //WebElement elementTime = (new WebDriverWait(driver, Duration.ofSeconds(10))
                //Метод для ожидания - что именно мы ожидаем? В нашем примере - появление элемента
        //        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='woodmart-nav-link'])[31]"))));

        //Теперь можно обращаться к драйверу
        //Например, перейти на соответствующий урл
        driver.get("https://bananababy.ru/");
        //Переменная, где храним ссылку на элемент
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Каталог товаров')]"));
        //Получить свойство элемента и запишем его в переменную
        String par = element.getAttribute("height");
        String par1 = element.getAttribute("line-height");
        //Выводит текст, отображаемый пользователю
        String par2 = element.getText();
        //Выведем их на экран
        System.out.println(par + " " + par1 + " " + par2);
        //Верстка стилей - обращаемся к элементу
        //Записываем стили в переменную
        String parametr1 = element.getCssValue("color");
        System.out.println(parametr1);
        //Действие с элементом, метод клик
        //Выбираем товар, фильтрация
        WebElement element1 = driver.findElement(By.xpath("//div[@class='index_cat_menu']//a[@class='root-item'][contains(text(),'Товары для малышей')]"));
        WebElement element2 = driver.findElement(By.xpath("//div[@class='index_cat_menu']//a[contains(text(),'Прогулочные коляски')]"));
        //Для более сложных манипуляций с элементами новый класс action
        //На вход всегда передаем driver
        Actions action = new Actions(driver);
        action
                .moveToElement(element1)
                .click(element2)
                .build()
                .perform();
        WebElement element3 = driver.findElement(By.xpath("//input[@id='arrFilter_P1_MAX']"));
        WebElement element4 = driver.findElement(By.xpath("//input[@id='set_filter']"));
        action
                .click(element3)
                .sendKeys(element3, Keys.DELETE)
                .sendKeys(element3, "10000")
                .click(element4)
                .release()
                .build()
                .perform();
        //Засыпание, чтобы визуально зафиксировать результат
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
}