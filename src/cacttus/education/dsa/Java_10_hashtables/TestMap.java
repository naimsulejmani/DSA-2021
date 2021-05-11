package cacttus.education.dsa.Java_10_hashtables;

public class TestMap {
    public static void main(String[] args) {
        String emri = "Naim";
        Map<Integer, String> naimi = new Map<>(emri.hashCode(), emri);
        Map<Integer, String> naimi1 = new Map<>(1, "Naim");

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
