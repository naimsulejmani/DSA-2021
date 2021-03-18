package cacttus.education.dsa.Java_2;

public class Ushtrime {
    /*
    1. Shkruaj metoden qe tregon se a ekziston vlera e dhene ne varg (Boolean)
     */


    /*
   2. Shkruaj metoden qe kthen indeksin
   ne te cilen gjendet vlera e dhene ne varg, nese nuk ekziston te kthen vleren -1
    */
    //resul selmani
    static int kerkimiSekuencialInt(int[] arr, int vlera) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == vlera)
                return i;
        }
        return -1;
    }


    /*
    3. Shkruaj metoden per te gjetur shumen e anetareve te vargut me numra te plote
     */
    static int SumA() {
        int arr[] = {6, 3, 1, 3, 4, 8, 7, 0};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = +arr[i];
        }
        return sum;
    }

    /*
    4. Shkruaj metoden per te gjetur prodhimin e anetareve te vargut me numra te plote
     */
    //resul selmani
    static long prodhimiArr(int[] arr) {
        long sum = 1;
        int i = 0;
        while (i < arr.length) {
            sum *= arr[i];
            i++;
        }
        return sum;
    }

    //En Gashi
    static int prodhimi(int[] arr) {

        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro = pro * arr[i];
        }
        return pro;
    }

    /*
     5. Shkruaj metoden qe gjen mesataren e numrave ne varg (Mean value)
     */

    //ensar hoxha
    public static int gjejMesataren(int[] array) {
        int sum = 0;
        int avarage = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avarage = sum / array.length;
        return avarage;
    }

    //resul selmani
    static double mesatarja(int[] arr) {
        int shuma = 0;
        int i = 0;
        while (i < arr.length) {
            shuma += arr[i];
            i++;
        }
        double mesatare = (double) shuma / arr.length;
        return mesatare;
    }


    /*
        6.Shkruaj metoden qe gjeneron nje varg te ri i cili eshte i mbushur me vlera
         se sa jane larg nga Mean Value

     */
    //ensar hoxha
    public static double[] gjejVleratMean(int[] array) {
//        int sum = 0;
//        double avarage=0;
//        for (int i =0;i<array.length;i++) {
//            sum += array[i];
//        }
//        avarage = (double) sum / array.length;
        double avarage = mesatarja(array);
        double[] values = new double[array.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = array[i] - avarage;
        }
        return values;
    }

    public static void main(String[] args) {
        int[] varg = new int[]{5, 7, 98, 123, 23, 65, 32, 65};
        double[] largNgaMesatarja = gjejVleratMean(varg);
        for (double nr :
                largNgaMesatarja) {
            System.out.printf("%.2f ,", nr);
        }
    }

    /*

    MIN detyra
     */
    //ensari
    public static int ktheNrMin(int[] array) {
        int min = array[0];
        for(int i = 0;i<array.length;i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //ensari
    public static int ktheNrMinOseIndex(int[] array, String vlera) {
        int min = array[0];
        int index = 0;
        for(int i = 0;i<array.length;i++) {
            if(min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        if(vlera.equals("index"))
            return index;
        else
            return min;
    }

    //resul selamni
    static int minNumPozita(int[] arr){
        int index = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == min)
                index = i;
        }

        return index;
    }

    //resuli
    //Class -> krijoni nje klase me 2 varaibal Index dhe Value ->
    static String minNumPozita2(int[] arr){
        int index = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == min)
                index = i;
        }
        return "Numri minimal ne varg eshte: " + min + " ne poziten " + index;
    }
    // Indeksi 10, vlera -100;
    // return "10,-100";
    // return "<index>10</index><numri>-100</numri>";
    // return new int[] {index, min};

    //resul selmani
    static int maxNum(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


}


