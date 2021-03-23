package cacttus.education.dsa.Java_3_ElementarySort;

public class ElementarySort {
    public static void main(String[] args) {
        //secili sort ka me sortu vargje (int[])
        int[] vargu = new int[]{72, 54, 59, 30, 31, 78, 2, 77, 82, 72};
        printArray(vargu);//printo vargun e pasortuar
        bubbleSort(vargu); // sorto vargun
        printArray(vargu); //printo vargun e sortuar
    }

    public static void printArray(int[] array) {
        for(int num: array) {
            System.out.printf("%d ",num);
        }
        System.out.println();
    }

    //metoda qe ben sortimin bubble sort
    public static void bubbleSort(int[] array) {
        //buble sort -> elementet me peshe me te renda shkojne ne fund
        //ne cdo hap iterues jemi te sigurt se elementi me i rend shkon ne fund
        //duhet te perseritet aq here sa ka elemente ne varg
        //defino perseritjen -> sa here duhet me persierte hapat
        //qe me u siguru se vargu jone do te sortohet
        for (int perseritja = 0; perseritja < array.length-1; perseritja++) {

            //fillo prej elementit te pare te vargut krahaso me fqinjen e tij
            // nese i kemi 100 element ka me shku deri tek 98-> kjo krahasohet me 99
            // per arsye se eshte zero based 0..99
            for (int index = 0; index < array.length - 1; index++) {
                //krahaso elemtin e zgjehdur me elementin vijues
                if (array[index] > array[index + 1]) {
                    //nese eshte me i madh ndro vendet
                    int temp = array[index]; // ruaje vleren me te madhe
                    array[index] = array[index + 1];
                    array[index + 1]=temp;
                }
            }


        }

    }


}
