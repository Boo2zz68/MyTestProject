package PracticJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Practice {
    public static void stringJob() {
        String test = "Я изучаю Java";
        System.out.println("Исходная строка: " + test);
        System.out.println("Длина строки: " + test.length());
        System.out.println("Нижний регистр: " + test.toLowerCase());
        System.out.println("Замена элементов: " + test.replace(" ", "|"));
        //Разбить строчку по разделителю и вывести отдельно как элементы массива
        String[] testArray = test.split(" ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
    /* Суммирование строк через метод аппенд класса стрингбилдер
    При большом обьеме операции обычное сложение стринг занимает
    слишком много времени
     */
    public static void sumString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 500000; i++) {
            result.append("result");
        }
        //И перевод обратно в обычную строку
        result.toString();
    }
    public static void concatenationString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String one = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String two = scanner.nextLine();
        System.out.println("Сумма строк");
        String sum = one + two;
        System.out.println(sum);
    }
    public static void equalsString() {
        for (int i = 0; i < 3; i ++) {
        String test = "Я учу Java";
        System.out.println("Повторите строку: Я учу Java");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        if(user.equals(test)) {
            System.out.println("Верно!");
            break;
        }
        else {
            System.out.println("Вы ошиблись! Попробуйте еще раз!");
        }
            System.out.println("Верно!");
        break;
        }

    }
    //Ручной выброс эксепшена
    public static int arithmeticTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Метод деления чисел");
        System.out.println("Введите: а");
        int a = scanner.nextInt();
        System.out.println("Введите: b");
        int b = scanner.nextInt();
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        System.out.println("Ответ: ");
        return a/b;
    }
    //Проброс исключения - оно выбросится только при использовании метода
    public static void exceptionTest() throws FileNotFoundException {
        File file = new File("Test.txt");
        InputStream in = new FileInputStream(file);
    }
}
