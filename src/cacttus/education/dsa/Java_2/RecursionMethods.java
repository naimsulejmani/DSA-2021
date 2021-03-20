package cacttus.education.dsa.Java_2;

public class RecursionMethods {
    public static void main(String[] args) {
        System.out.println(factoriel(5));
        System.out.println(shumaRecursive(10));
    }

    static int factoriel(int num) {
        if (num <= 1) return 1;
        return num * factoriel(num - 1);
    }

    static int shumaRecursive(int num) {
        if (num <= 0) return 0;
        return num + shumaRecursive(num - 1);
    }


}
