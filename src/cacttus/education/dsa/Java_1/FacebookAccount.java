package cacttus.education.dsa.Java_1;

public class FacebookAccount {
    //variablat instance
    private String name;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private char gender;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    //konstruktori definohet si public EmriClasses nuk ka tip kthyes
    public FacebookAccount(String name, String lastName, String phoneNumber, String emailAddress,
                           String personalNo) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.personalNo = personalNo;
    }

    private String personalNo;

    public String getPersonalNo() {
        return personalNo;
    }

//    public void setPersonalNo(String personalNo) {
//        this.personalNo = personalNo;
//    }

    //Vetit get dhe set me ane te se ciles ne i kemi mundesi me iu qas variablave private te instances
    //keto jane API apo metodat komunikuese me variablat private

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
