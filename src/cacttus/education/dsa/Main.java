package cacttus.education.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //deklarimi i vargut te thjeshte
        int[] numbers;
        //inicializimi i vargut
        numbers = new int[10]; // [0,0,0,0,0,0,0,0,0];

        String[] names = new String[10]; //[null, null, null, null, null....];
        numbers[0] = 10; //qasja e indeksave prej 0 deri madhesia-1 (10-1=9)
        //numbers[10] = 20; //ketu gjuan gabim index out of bound exception

        numbers = new int[]{5, 6, 7, 8, 9, 10};

        /*
                Object - Ademi / Adami
         */

        //ketu mundemi me ruajt cfaredo objekti (tipi)
        ArrayList list = new ArrayList(); //Object[] list = new Object[10];
        Scanner reader = new Scanner(System.in);

        list.add(100);//counter = 1;

        list.add(200); //counter = 2;
        list.add(1, "Naim");
        list.add(3, "Filan");
        list.add(true);
        list.add(200f);
        list.add(400.35);
        list.add(20000l);
        list.add(reader);//objektin e scanner
        System.out.println(list.size());

        //leximi nga ArrayList

        int nr = (int) list.get(0);
        String name = (String) list.get(1);
        String a = (String) list.get(3);

        System.out.println("NR = " + nr);
        System.out.println("NAME = " + name);
        System.out.println(a);
//        list.add(9,"Naim");
//        list.add(8,"Filan");



    }
}
