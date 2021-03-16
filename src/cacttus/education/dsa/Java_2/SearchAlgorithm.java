package cacttus.education.dsa.Java_2;

public class SearchAlgorithm {

    public static void main(String[] args) {
        //sequentialSearchResul();
        //sequentialSearchMirlinda();
        //sequentialSearchProfaJoBashMire();

        int[] arr = new int[]{98, 123, 123, 435, -324, -4, 123, 123};
        int[] arrSort = new int[]{-5, -64, 123, 123, 575, 9912, 123123};
        boolean exists = sequentialSearch(arr, -4);
        boolean existsBinary = binarySearch(arrSort, -63);
        System.out.printf("Number %d %sexists on array%n", -4, exists ? "" : "doesn't ");
        System.out.printf("Number %d %sexists on array%n", -63, existsBinary ? "" : "doesn't ");
        boolean existBinarySearchRecursive = binarySearchRecursive(arrSort,-63,0,arr.length-1);
        System.out.println(existBinarySearchRecursive);

    }

    public static int binarySearch(int value, int[] array) {
        return binarySearch(array, value, 0, array.length);
    }

    //rekurzion
    public static int binarySearch(int[] array, int value, int start, int end) {//n is the array length
        if (start >= end) {
            if (array[start] == value)
                return start;
            return -1;
        }

        if (array[(end + start) / 2] == value)
            return (end + start) / 2;
        else if (array[(end + start) / 2] > value)
            return binarySearch(array, value, start, (end + start) / 2);
        else
            return binarySearch(array, value, (end + start) / 2, end);
    }


    public static boolean binarySearchRecursive(int[] array, int searchValue, int low, int heigh) {
        if (heigh < low) return false;

        int mid = (low + heigh) / 2;

        if (searchValue == array[mid]) return true;
        if (searchValue > array[mid]) return binarySearchRecursive(array, searchValue, mid + 1, heigh);
        else return binarySearchRecursive(array, searchValue, low, mid - 1);
    }


    public static boolean binarySearch(int[] array, int searchValue) {
        //kufijte
        int low = 0, high = array.length - 1, mid;

        //perderisa kufiri i poshtem eshte me i vogel ose i barabarte me kufirin e eperme vazhdo kerko numrin
        while (low <= high) {
            mid = (low + high) / 2; // e gjejme mesin e vargut (mesin e elemnteve)
            //kontrollo vlera qe po kerkojme a eshte e barabrte me vleren e mesme te vargut
            if (array[mid] == searchValue) return true;

            //nese vlera qe po kerkojme eshte me madhe se vlera e elemetit ne mes te vargut
            //atehere ndryshon kufiri i poshtem perndryshe ndryshon kufiri i eperm
            if (searchValue > array[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }


    public static boolean sequentialSearch(int[] array, int searchValue) {
        for (int number : array) {
            if (number == searchValue) return true;
        }
        return false;
    }

    public static void sequentialSearchProfaJoBashMire() {
        int[] arr = {2, 30, 31, 54, 59, 72, 72, 77, 78, 82};
        int searchNo = 78;
        int index = 0;

        boolean found = false;
        while (index < arr.length && !found) {
            if (arr[index++] == searchNo) found = true;
        }
        System.out.println(searchNo + (found ? " is " : " is not ") + "found");
    }

    public static void sequentialSearchResul() {
        System.out.print("Shkruaj numrin qe doni te gjeni: ");

        int nr = 2;
        int[] arr = {2, 30, 31, 54, 59, 72, 72, 77, 82};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nr) {
                System.out.printf("Numri juaj %d eshte ne poziten %d", nr, i);
                break;
            }
        }
    }

    public static void sequentialSearchMirlinda() {
        int[] num = {1, 22, 43, 554, 5};
        int findNumber = 43;
        boolean found = false;
        for (int n : num) {
            if (n == findNumber) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(findNumber + " is found.");
        else
            System.out.println(findNumber + " is not found.");
    }
}
