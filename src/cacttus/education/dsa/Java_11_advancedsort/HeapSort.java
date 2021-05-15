package cacttus.education.dsa.Java_11_advancedsort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {59, 45, 87, 100, 2, 11, 56, 44, 33, 12, 98, 87};

        HeapSort heapSort = new HeapSort();
   //     System.out.println(heapSort.findFuqia(12));
        heapSort.print(array);
        System.out.println();
        heapSort.sort(array);
        heapSort.print(array);
    }

//    public int findFuqia(int value) {
//        int baza = 2;
//        int counter = 0;
//        while (value >= 1) {
//            value /= baza;
//            counter++;
//        }
//        return counter;
//    }

    public void sort(int[] array) {
        //nderto pemen - stogun
        //nese i kemi 20 elemente ne varg 20/2 = 10 vizita me kontrollu me ndertu stogun heap
        //

        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        print(array);
        //shthurja e elemtit nga stogu heap - nga heap tree
        //behet duke terhjek elemetin e pare - root (elemetin 0)->
        //duke e zavendesu me elementin e fundit , duke e zvogul hapesin
        // e pasortume (length-1, lenght-2) dhe duke e be hepify [jesen e mbetur

        for (int i = array.length - 1; i > 0; i--) {
            //beni svap elemetin e fundit me te parin
            int temp = array[0];//rootin ruaje ne temp se eshte me i madh
            array[0] = array[i]; //elemetin i fundit e zevendeson te parin
            array[i] = temp;//zevendeso elemtin e fundit me root

            //nderto stogun - hepaify elemetin e pare (root)
            //per pjesen e mbetur te pasortuar (pasi elementi i zevendesuar eshte sortuar)
            heapify(array, i, 0);
        }

    }

    private void swap(int[] array, int fromIndex, int toIndex) {

    }

    public void print(int[] array) {
        for (int number : array) {
            System.out.printf("%5d,", number);
        }
        System.out.println();
    }


    public void heapify(int[] array, int length, int currentIndex) {
        int largest = currentIndex;
        int leftIndex = 2 * currentIndex + 1;
        int rightIndex = leftIndex + 1;

        //nese femija i anes majte eshte me imadh atehere largest eshte a ana e majt
        if (leftIndex < length && array[leftIndex] > array[largest])
            largest = leftIndex;

        //nese femija i anes djathte eshte me imadh atehere largest eshte a ana e djathte
        if (rightIndex < length && array[rightIndex] > array[largest])
            largest = rightIndex;

        if (largest != currentIndex) {
            int temp = array[currentIndex];
            array[currentIndex] = array[largest];
            array[largest] = temp;

            //beni hepaify prej elementit largest e tutje
            heapify(array, length, largest);
        }
    }
}
