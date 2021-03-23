package cacttus.education.dsa.Java_3_ElementarySort;

public class ElementarySort {
    public static void main(String[] args) {
        //secili sort ka me sortu vargje (int[])
        //int[] vargu = new int[]{72, 54, 59, 30, 31, 78, 2, 77, 82, 72};
        int[] vargu = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(vargu);//printo vargun e pasortuar
        bubbleSort(vargu); // sorto vargun
        //sortIt(vargu);
        printArray(vargu); //printo vargun e sortuar


        String[] emrat = new String[]{
                "A", "AB", "ABC", "Viktor", "Naim", "Besfort", "Rita", "Elona", "Endrit", "En", "Arber"
        };

        printArray(emrat); //printo emrat te pasortuar
        bubbleSort(emrat);//sorto emrat
        printArray(emrat); //printo emrat pas sortimit
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    //Viktori
    public static void sortIt(int[] arr) {
        int temp;
        boolean isSorted = false;
        for (int i = 0; i < arr.length - 1 && !isSorted; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            printArray(arr);
//            if (isSorted)
//                break;
        }
    }


    //compareTo ne String -> 0 per barabar, >0 per ma e madhe <0 per ma e vogel
    //naim.compareTo(viktori) -> -7
    //viktor.compareTo(naim) -> 7
    //naim.compareTo(nani) -> 6
    public static void bubbleSort(String[] array) {
        boolean anySwap = true;
        for (int perseritja = 0; perseritja < array.length - 1 && anySwap; perseritja++) {
            anySwap = false;
            for (int index = 0; index < array.length - 1 - perseritja; index++) {
                if (array[index].compareTo(array[index + 1]) > 0) {
                    String temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    anySwap = true;
                }
            }
            System.out.println("Iteracioni " + (perseritja + 1));
            printArray(array);
        }
    }


    //metoda qe ben sortimin bubble sort
    public static void bubbleSort(int[] array) {
        //buble sort -> elementet me peshe me te renda shkojne ne fund
        //ne cdo hap iterues jemi te sigurt se elementi me i rend shkon ne fund
        //duhet te perseritet aq here sa ka elemente ne varg
        //defino perseritjen -> sa here duhet me persierte hapat
        //qe me u siguru se vargu jone do te sortohet
        boolean anySwap = true;
        for (int perseritja = 0; perseritja < array.length - 1 && anySwap; perseritja++) {
            //fillo prej elementit te pare te vargut krahaso me fqinjen e tij
            // nese i kemi 100 element ka me shku deri tek 98-> kjo krahasohet me 99
            // per arsye se eshte zero based 0..99
            anySwap = false;
            for (int index = 0; index < array.length - 1 - perseritja; index++) {
                //krahaso elemtin e zgjehdur me elementin vijues
                if (array[index] > array[index + 1]) {
                    //nese eshte me i madh ndro vendet
                    int temp = array[index]; // ruaje vleren me te madhe
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    anySwap = true; // trego qe ka ndryshme per me u persire
                }
            }
            System.out.println("Iteracioni " + (perseritja + 1));
            printArray(array);
        }

    }


}
