package cacttus.education.dsa.Java_11_advancedsort;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = new int[]{58, 69, 36, 74, 25, 18, 256, 963, 2, 8, 55, 75, 44, 88, 44};
        RadixSort rs = new RadixSort();
        System.out.println("Vargu i pasortuar: ");
        printArray(array);
        rs.radix_sort(array);
        System.out.println("Vargu i sortuar:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }
//metode e cila kthen numrin me te madh ne varg

    public int maximumValue(int array[]) {
        int max = array[0]; // elementi me i madh ne varg supozojme?
        for (int number : array) {
            if (number > max) max = number;
        }
        return max;
    }

    //sorti radix => counting sort
    /*
    Sortimi radix -> baza 2 -> 0,1 => binar
    Sortimi radix -> baze 8 -> 0,1,2,3,4,5,6,7 => octal
    Sortimi radix -> baze 10 -> 0,1,2,3,4,5,6,7,8,9 => decimal
    Sortimi radix -> baze 16 -> 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F => hexadecimal
            nje varg me numra prej 0-1000
            int[] count = new int[1001]; //0,1,2,3,...,999
            count behet kumulativ => mbledhet mes veti counter njera pas tjetres
            int[] elements = {98,87,123,123,123,876,999,0,1,2};
     */

    public void radix_sort(int[] array) {
        int loopNr = maximumValue(array); // numri i hapave qe do te perseritet (100,5825)
        //5825
        //5825/1=5825
        //5825/10=582
        //5825/100=58
        //5825/1000=5
        //5825/10000 = 0
        for (int exp = 1; loopNr / exp > 0; exp = exp * 10) {
            count_sort(array, exp);
        }
    }

    public void count_sort(int[] array, int exp) {
        int[] output = new int[array.length];
        int[] count = new int[10];//10 per sistemin decimal, nese baza eshte binare [2], [8] octal dhe [16] hexadecimal
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }//duhet me inicializu per arsye qe me perdore pastaj post-increment ++
        //Arrays.fill(count,0);//
        //pjesa ku kena me rrite numrin (counterin) 78,12,98,1,10
        for (int i = 0; i < array.length; i++) {
            int counterIndex = (array[i] / exp) % 10;
            count[counterIndex]++;
        } // N hapa

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        } //10

        for (int i = array.length - 1; i >= 0; i--) {
            int counterIndex = (array[i] / exp) % 10; //gjej indexin ne counter
            count[counterIndex]--;
            output[count[counterIndex]] = array[i];

        } // n hapa

        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }//n hapa
        //n+10+n+n = 3n+10 => O(N*L)
    }

}