package PracticJava;

public class StringPractice {
    public static void stringJob() {
        String test = "Я изучаю Java";
        System.out.println("Исходная строка: " + test);
        System.out.println("Длина строки: " + test.length());
        System.out.println("Нижний регистр: " + test.toLowerCase());
        System.out.println("Строка с разделителем: " + test.replace(" ", "|"));
        //Разбить строчку по разделителю и вывести отдельно как элементы массива
        String[] testArray = test.split(" ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}
