package cacttus.education.dsa.Java_1;

public class ListaJone {
    private String[] array = new String[10];//[null, null,null,]
    private int size = 0; //sa elemente jane ne Listen tone

    //metoda add
    public void add(String element) {
        array[size++] = element;
        //   array[size] = element;
        //   size++
    }

    public String get(int index) {
        if (index < size)
            return array[index];
        return null;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


}
