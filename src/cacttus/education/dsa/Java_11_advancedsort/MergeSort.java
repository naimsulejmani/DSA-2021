package cacttus.education.dsa.Java_11_advancedsort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {90, 87, 100, 6, 65, 34, 12, 94};
        mergeSort(array, array.length);

        System.out.println(Arrays.toString(array));
    }


    //vargun e pasortuar, dhe numrin e elementeve n
    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            //kemi vetem nje element ne liste
            return;
        }
        //gjej antarin e mesit ku duhet me nda vargun
        int mid = n / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];
//  ploteso vargun e majte me vlerat prej array
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            rightArray[i - mid] = array[i];
        }

        //provo te ndash anen e majt te vargut ne dy pjese
        mergeSort(leftArray, mid);
        //provo te ndash anen e djath te vargut ne dy pjese
        mergeSort(rightArray, n - mid);

        //bashko elementet e vargut prej si jan kthy
        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] lArray, int[] rArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;

        while (leftIndex < lArray.length && rightIndex < rArray.length) {
            if (lArray[leftIndex] <= rArray[rightIndex]) {
                array[index++] = lArray[leftIndex++];
            } else {
                array[index++] = rArray[rightIndex++];
            }
        }

        //nese u mbet dicka nga ana e majt pa u insertu ne varg
        while (leftIndex < lArray.length) {
            array[index++] = lArray[leftIndex++];
        }

        //nese u mbet dicka nga ana e djatht pa u insertu ne varg
        while (rightIndex < rArray.length) {
            array[index++] = rArray[rightIndex++];
        }
    }
}
