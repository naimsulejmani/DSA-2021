package cacttus.education.dsa.Java_7.stackexample;

import java.util.ArrayList;

public class ElementTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //DataType -> reference
        Element<Integer> intElement = new Element<>(100, null);
        System.out.println(intElement.getData());

        Element<String> stringElement = new Element<>("Naim", null);
        System.out.println(stringElement.getData());

        try {
            Stack<Integer> intStack = new Stack<>();
            intStack.push(100);
            intStack.push(200);
            intStack.push(300);

            System.out.println(intStack.peek());
            System.out.println(intStack.peek());
            System.out.println(intStack.pop());
            System.out.println(intStack.peek());

            Stack<String> renditjaTabelar = new Stack<>();
            renditjaTabelar.push("Barcelona");
            renditjaTabelar.push("Atletico Madrid");
            renditjaTabelar.push("Real Madrid");

            //qysh me zbraze stackun nje nga nje
            //perderisa renditja tabelar nuk eshte e zbrazet ! - negacioni (nuk)
            while (!renditjaTabelar.isEmpty()) {
                System.out.println(renditjaTabelar.pop());
            }
            //nese ketu tash e hjekum nje element
            renditjaTabelar.pop();


            System.out.println("Stack u zbraz :)");


        } catch (StackOverflowException ex) {
            System.out.println("Stack-u eshte full!!!");
        } catch (StackUnderflowException ex) {
            System.out.println("Stack-u eshte i zbrazet!!!");
        }

//        Exception
    }
}
