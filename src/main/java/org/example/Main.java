package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //Подключаем скаченный экземпляр веб драйвера для Хрома
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Пользователь\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Создаем экземпляр класса веб драйвер
        WebDriver driver = new ChromeDriver();
        //Теперь можно обращаться к драйверу
        //Например, перейти на соответствующий урл
        driver.get("https://www.google.ru/");
        //Переменная, где храним ссылку на элемент
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[2]/a"));
        //Действие с элементом
        element.click();
        //В конце закрываем браузер
        driver.close();

    }
}