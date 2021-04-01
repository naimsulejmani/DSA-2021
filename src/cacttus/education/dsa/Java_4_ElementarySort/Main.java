package cacttus.education.dsa.Java_4_ElementarySort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {90, 123, 12, 5};
        Arrays.sort(nums);
        for(int n : nums) {
            System.out.println(n);
        }

        int nr = 10;
        switch (nr) {
            case 1:
                lajmerohuNeRecepsion();
                break;
            case 2:
                int numri = readNumri();
                break;
        }

        String teksti = "Une jam nje shqiptar i mire!";

        String[] fjalet = teksti.split(" ");

        for(String fjala: fjalet) {
            System.out.println(fjala);
        }

    }

    public static void lajmerohuNeRecepsion() {
        //ketu e implementoj metoden
    }

    public static int readNumri() {
        Scanner reader = new Scanner(System.in);
        return  reader.nextInt();
        //ketu e implementoj me vone
        //return 0;
    }
}
