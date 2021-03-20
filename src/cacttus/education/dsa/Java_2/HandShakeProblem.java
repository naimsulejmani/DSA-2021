package cacttus.education.dsa.Java_2;

public class HandShakeProblem {
    public static void main(String[] args) {
        System.out.println(handshake(4));
    }

    static int handshake(int num) {
        if (num <= 2) return 1;
        return num - 1 + handshake(num - 1);
    }
}
