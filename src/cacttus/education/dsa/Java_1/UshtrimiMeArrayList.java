package cacttus.education.dsa.Java_1;

import java.util.ArrayList;
import java.util.Scanner;

public class UshtrimiMeArrayList {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa student kan hy ne provim (DSA): ");
        int nr = reader.nextInt();
        ArrayList<String> names = new ArrayList<>(nr);
        ArrayList<Integer> grades = new ArrayList<>(nr);

        for (int index = 0; index < nr; index++) {
            reader.nextLine();
            System.out.printf("Shkruaj emrin e studentit %d: ", index + 1);
            String emri = reader.nextLine();

            System.out.printf("Shkruaj noten e %s per lenden DSA: ", emri);
            int grade = reader.nextInt();

            names.add(emri);
            grades.add(grade);
        }
        //shtypja e notave per secilin student
        for (int index = 0; index < nr; index++) {
            System.out.printf("Studenti %s ka marr noten ne DSA -> %d %n",
                    names.get(index), grades.get(index));
        }

        int maxIndex = maxGradeIndex(grades);

        System.out.printf("Studenti i pare qe ka note maximale eshte %s dhe ka noten %d",
                names.get(maxIndex),grades.get(maxIndex)
                );
    }

    //shkruani metoden e cila pranon parameter listen dhe kthen indeksin me noten maksimale
    public static int maxGradeIndex(ArrayList<Integer> grades) {
        if (grades.size() == 0) return -1;

        int maxIndex = 0;
        int maxGrade = grades.get(maxIndex);

        /*
                -2147483648
                [-2147483648,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648]
         */

        for (int i = maxIndex + 1; i < grades.size(); i++) {
            int vlera = grades.get(i);
            if (vlera > maxGrade) {
                maxGrade = vlera;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
