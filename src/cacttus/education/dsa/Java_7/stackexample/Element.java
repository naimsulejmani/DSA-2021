package cacttus.education.dsa.Java_7.stackexample;

//Element i tpit gjenerik
// <T> - tregon se tipi eshte dinamik i mvarur nga shfrytezuesi (runntime percaktimi)
public class Element<T> {
    private T data; //variabla me tip generic
    private Element next;

    public Element(T data, Element next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
