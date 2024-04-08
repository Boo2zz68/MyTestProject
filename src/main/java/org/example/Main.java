package org.example;

import org.openqa.selenium.WebDriver;
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


    }
}