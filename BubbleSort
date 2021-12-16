package nick.pack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Сортировка пузырьком - это метод сортировки массивов и списков путем последовательного сравнения и
        обмена соседних элементов, если предшествующий оказывается больше последующего.
        */
      int [] array = {10,2,56,12,42,3,7,812,2,4};
      boolean n = true;
      while (n) {
          n = false;
          for (int i = 1; i < array.length; i++) {
              if (array[i] < array[i-1]){
                  int tmp = array[i];
                  array[i] = array[i - 1];
                  array[i - 1] = tmp;
                  n = true;
              }
          }
      }
      System.out.println(Arrays.toString(array));
    }
}
