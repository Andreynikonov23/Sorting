package nick.pack;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        /*
        Принцип выборочной сортировки такой,
        каждый проход выбирать самый минимальный элемент и смещать его в начало.
        При этом каждый новый проход начинать сдвигаясь вправо,
        то есть первый проход — с первого элемента, второй проход — со второго.
         */
        int[] array = {10,2,5,23,124,14,5,1,6,33};
        for (int i = 0; i < array.length -1; i++) {
            int least = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[least]){
                    least = j;
                }
            }
            int tmp = array[i];
            array[i] = array[least];
            array[least] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
