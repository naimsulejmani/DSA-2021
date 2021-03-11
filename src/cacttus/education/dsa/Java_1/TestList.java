package cacttus.education.dsa.Java_1;

public class TestList {
    public static void main(String[] args) {
        ListaJone lista = new ListaJone();
        lista.add("Naim");
        lista.add("Filani");
        lista.add("Fisteke");

        String vlera1 = lista.get(0);

        System.out.println(vlera1);

        lista.printAll();

    }
}
