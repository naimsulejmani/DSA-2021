package cacttus.education.dsa.Java_7;

public class TestStackMemoryOverflow {
    public static void main(String[] args) {
        callMe();
    }
    public static  void callMe() {
        callMe();
    }
}
