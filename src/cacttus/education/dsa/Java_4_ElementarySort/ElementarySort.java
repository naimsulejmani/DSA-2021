package cacttus.education.dsa.Java_4_ElementarySort;

public class ElementarySort {
    public static void main(String[] args) {
        int[] vargu = new int[]{44, 82, 10, 65, 90, 98, 75, 73, 62, 76, 83, 87, 9};
        cacttus.education.dsa.Java_3_ElementarySort.ElementarySort.printArray(vargu);
        //selectionSort(vargu);
        //selectionSortSlide(vargu);
        insertionSort(vargu);
        cacttus.education.dsa.Java_3_ElementarySort.ElementarySort.printArray(vargu);
    }

    public static void selectionSort(int[] array) {
        //fillo nga elementi i pare deri tek elementi i parafundit
        //duke u rritur per njo
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; //supozojme se elementi i pare eshte minimumi
            //shko nga elementi vijues deri tek elementi i fundit
            for (int j = i + 1; j < array.length; j++) {
                //krahaso me elemetin minUm te supozuar
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            //kontrollo se minIndex a ka ndryshu prej supozimit
            if (minIndex != i) {
                //beni swap vender
                int temp = array[minIndex]; //ruaje minimumin ne temp
                array[minIndex] = array[i];//mbishkruaje vargun ku ka qene mini
                //mumi me vleren e te madhe
                array[i] = temp;//mbishkruaje vargun ku po deshirojme me vendose vleren minimale
            }
            cacttus.education.dsa.Java_3_ElementarySort.ElementarySort.printArray(array);
        }
    }

    public static void selectionSortSlide(int[] array) {
        //fillo nga elementi i pare deri tek elementi i parafundit
        //duke u rritur per njo
        for (int i = 0; i < array.length - 1; i++) {
            //shko nga elementi vijues deri tek elementi i fundit
            for (int j = i + 1; j < array.length; j++) {
                //krahaso me elemetin minUm te supozuar
                //momentin e pare qe e gjejme se kemi element me te vogel,
                //atehere ndrysho, beni swap wargjet
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            cacttus.education.dsa.Java_3_ElementarySort.ElementarySort.printArray(array);

        }
    }

    public static void insertionSort(int[] array) {
        //fillo nga elementi i pare (i pjeses se pasorutar) dhe shko deri ne fund
        for (int pointer = 1; pointer < array.length; pointer++) {
            int current = array[pointer];
            int position = pointer;

            //kete binary se deri ne cilin pozicion duhet me shku per me bo shiftin

            while (position > 0 && array[position - 1] > current) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = current;
            cacttus.education.dsa.Java_3_ElementarySort.ElementarySort.printArray(array);
        }
    }

}
