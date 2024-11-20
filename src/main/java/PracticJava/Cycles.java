package PracticJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Cycles {
    /* Метод генерит рандомный одномерный массив,
    выводит его на экран и высчитывает его максимальное
    и минимальное значения
     */
     public static void arrayMinMax(){
        Random random = new Random();
        int length = 10;
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                }
            if (nums[i] < min) {
                min = nums[i];
                }
            }
        System.out.println("Максимальное значение = " + max + ", а минимальное = " + min);
        }
        //Метод для переворачивания массива
        public static void arrayReverse() {
         int a = 0;
         int length = 10;
         Random random = new Random();
         int[] nums = new int[length];
         for (int i = 0; i < nums.length; i++) {
             nums[i] = random.nextInt(10);
            }
         System.out.println(Arrays.toString(nums));
         for (int i = 0; i < nums.length/2; i++) {
             a = nums[i];
             nums[i] = nums[nums.length -1 -i];
             nums[nums.length -1 -i] = a;
            }
            System.out.println(Arrays.toString(nums));
        }
        //Метод создания матрицы нулей и заполнения диагоналей 1
        public static void arrayDiagonal() {
         int[][] arr = new int[10][10];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Выставим единички по диагоналям");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                    }
                    if (i + j == arr.length - 1) {
                        arr[i][j] = 1;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

