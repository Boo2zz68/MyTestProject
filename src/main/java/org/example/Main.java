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
        driver.get("https://leonardo.ru/");
        //Переменная, где храним ссылку на элемент
        WebElement element = driver.findElement(By.xpath("//a[@aria-label='Меню каталога']"));
        //Получить свойство элемента и запишем его в переменную
        String par = element.getAttribute("hostname");
        String par1 = element.getAttribute("contentEditable\n");
        //Выводит текст, отображаемый пользователю
        String par2 = element.getText();
        //Выведем их на экран
        System.out.println(par + " " + par1 + " " + par2);
        //Верстка стилей - обращаемся к элементу
        //Записываем стили в переменную и выводим на экран
        String parametr1 = element.getCssValue("color");
        System.out.println(parametr1);

        /*Работа с модальными окнами (в выключенном состоянии)
        Есть некая кликабельная ссылка/кнопка на странице, вызывающая модальное окно
        WebElement element1 = driver.findElement(By.xpath("a"));
        element1.click();
        Функция alert для работы с модальными окнами
        Первый способ через switch, но есть вероятность, что окно не успеет подгрузится
        Alert alert = driver.switchTo().alert();
        Второй способ - через ожидания
        Создаем экземпляр явных ожиданий
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        И запускаем alert, пока окно не появится
        Alert alert = wait.until(alertIsPresent());
        Далее прописываются действия с окном
        Например, если это уведомление, которое нужно принять Ок
        alert.accept();
        Если в окне есть некий ввод, то
        alert.sandKeys("text");
        alert.accept();
        Если в окне действия Ок и Отмена, то можно например отменить
        alert.dismiss();*/

        //Действие с элементом, метод клик
        //Выбираем товар, фильтрация
        //Для более сложных манипуляций с элементами новый класс action
        //На вход всегда передаем driver
        Actions action = new Actions(driver);
        action
                .click(element)
                .build()
                .perform();
        WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]"));
        WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Для пэчворка')]"));
        action
                .moveToElement(element1)
                .click(element2)
                .build()
                .perform();
        //Настраиваем фильтр через поле ввода
        WebElement element3 = driver.findElement(By.xpath("//input[@placeholder='6 230']"));
        WebElement element4 = driver.findElement(By.xpath("//a[2]//ins[1]"));
        WebElement element5 = driver.findElement(By.xpath("//div[@class='sort-title']"));
        WebElement element6 = driver.findElement(By.xpath("//a[contains(text(),'Цена от высокой')]"));
        action
                .moveToElement(element3)
                .click(element3)
                .sendKeys(element3, Keys.DELETE)
                .sendKeys(element3, "5000")
                //Вместо текста можно прописать путь до файла если импут для загрузки
                .pause(3000)
                .click(element4)
                .click(element5)
                .click(element6)
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