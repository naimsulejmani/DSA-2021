package cacttus.education.dsa.Java_1;

public class TestObjects {
    public static void main(String[] args) {

        FacebookAccount naimisAccount; //cfare vlera ke ketu
        //FacebookAccount() -> konstruktor
        naimisAccount = new FacebookAccount("Naim", "Sulejmani", "049",
                "naja@xyz.com", "1234567890");
        FacebookAccount viktorinAccount = new FacebookAccount("Viktor", "Ahmeti", "123",
                "viki@math.com", "999999");

        //setPassword
        naimisAccount.setGender('M');
        System.out.println(naimisAccount.getName() + " "
                + naimisAccount.getLastName() + " "
                + naimisAccount.getPersonalNo());

        CarResul amg = new CarResul("Mercedes", "AMG", 2021);
        amg.setColor("Black");

        //naimisAccount.setPersonalNo("1234567890");
//        naimisAccount.setName("Naim");
//        naimisAccount.setLastName("Sulejmani");
//        naimisAccount.setGender('M');
//        naimisAccount.setEmailAddress("naim.sulejmani@faculty.cacttus.education");
//        //...
//
//        FacebookAccount mirlindaAccount = new FacebookAccount();
//        mirlindaAccount.setName("mirlinda");
//        mirlindaAccount.setLastName("Xhelili");
//        //...
//
//        System.out.println(naimisAccount.getName() + " " + naimisAccount.getLastName()+naimisAccount.getPersonalNo());
//       // naimisAccount.setPersonalNo("1234567891");
//        System.out.println(naimisAccount.getName() + " " + naimisAccount.getLastName()+naimisAccount.getPersonalNo());
//        System.out.println(mirlindaAccount.getName() + " " + naimisAccount.getLastName());


    }
}
