package minus417;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MyUtils {
    public static void arrTelephone() {
        //Вывод массива сгенерированных телефонов
        String[] tels = new String[10];
        for(int i=0; i< tels.length; i++) {
            tels[i] = generateTelephone();
            System.out.println(tels[i]);
        }
    }
    //Генерация телефонов
    public static String generateTelephone() {
        Random random = new Random();
        String telephone = "";
        telephone += "+7"; //регион
        telephone += "999"; //оператор
        for (int i = 0; i < 7; i++) {
            telephone += random.nextInt(10);
        }
        return telephone;
    }
    //Генерация ИНН
    public static String generateINN(){
        Random random = new Random();
        String inn = "";
        for (int i = 0; i < 11; i++) {
            inn += random.nextInt(10);
        }
        return inn;
    }
    //Скриншот экрана браузера
    public static File makeScreenshot(WebDriver driver, String filename) {
        File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("./target/" + filename);
        try {
            FileUtils.copyFile(temp, destination);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return destination;
    }
}
