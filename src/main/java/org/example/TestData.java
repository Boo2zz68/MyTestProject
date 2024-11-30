package org.example;

import java.util.Random;

public class TestData {
    public static void main(String[] args) {
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
}
