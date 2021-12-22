package warmUp;


import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
        выведите массивы на экран в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше
        (либо сообщите, что их средние арифметические равны).
        */
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*(5-0)+1)-0;
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = (int)(Math.random()*(5-0)+1)-0;
        }
        System.out.println(Arrays.toString(arr2));
        int mid1 = 0;
        int a = 0;
        for (int i = 0; i < arr1.length; i++) {
            a += arr1[i];
        }
        mid1 = a/ arr1.length;
        System.out.println(mid1);
        int mid2 = 0;
        int b = 0;
        for (int i = 0; i < arr2.length; i++) {
            b += arr2[i];
        }
        mid2 = b / arr2.length;
        System.out.println(mid2);
        if (mid1 > mid2){
            System.out.println("Среднее арифметическое массива arr1 больше");
        } else
            System.out.println("Среднее арифметическое массива arr2 больше");
    }
}
