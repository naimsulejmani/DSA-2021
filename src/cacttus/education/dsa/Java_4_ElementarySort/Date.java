package cacttus.education.dsa.Java_4_ElementarySort;

import java.net.Inet4Address;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //specifiku delimiterin 05.06.2020=> DD.MM.YYYY
    public Date(String date) {
        String[] splittedDate = date.split("-");
//        for(String s:splittedDate) {
//            System.out.println(s);
//        }
        this.day= Integer.parseInt(splittedDate[0]);
        this.month = Integer.parseInt(splittedDate[1]);
        this.year=Integer.parseInt(splittedDate[2]);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
