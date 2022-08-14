package nick.pack;


import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            int[] arr = {54, 128, 138, 23, 75, 168, 159, 98, 3, 0};
            System.out.println(Arrays.toString(selectionSort(arr)));
        }

        private static int maxEl(int[] arr){
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
        public static int[] selectionSort(int[] arr){
            int[] sortArr = new int[arr.length];
            for (int i = 0; i < sortArr.length; i++) {
                int maxIndex = maxEl(arr);
                sortArr[i] = arr[maxIndex];
                arr[maxIndex] = 0;
            }
            return sortArr;
        }
        
}
