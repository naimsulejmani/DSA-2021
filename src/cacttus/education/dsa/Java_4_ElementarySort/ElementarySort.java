package cacttus.education.dsa.Java_4_ElementarySort;

public class ElementarySort {
    public static void main(String[] args) {
        int[] vargu = new int[]{44, 82, 10, 65, 90, 98, 75, 73, 62, 76, 83, 87, 9};
        cacttus.education.dsa.Java_3_ElementarySort.ElementarySort.printArray(vargu);
        selectionSort(vargu);
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
        }
    }
}
