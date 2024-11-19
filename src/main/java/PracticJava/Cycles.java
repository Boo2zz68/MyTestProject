package PracticJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Cycles {
    /* Метод генерит рандомный одномерный массив,
    выводит его на экран и высчитывает его максимальное
    и минимальное значения
     */
     public static int arrayMinMax(){
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
        return length;
        }
    }

