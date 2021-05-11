package cacttus.education.dsa.Java_10_hashtables;

public class SimulatingHashTable {
    public static void main(String[] args) {
        //simulojme se kemi nje varg me te dhena
        //dhe ate varg kemi me vendose ne hashtabele
        String[] emrat = {"Naim", "Viktor", "Mirlinde", "Ensar", "Taulant", "Benjamin Agora"};

        String[] hashTable = new String[29];

        for (String emri : emrat) {
            System.out.println(emri + " -> " + emri.hashCode()+" - "+(emri.hashCode()) % hashTable.length);
            hashTable[Math.abs(emri.hashCode()) % hashTable.length] = emri;
        }

        for(String hashValue: hashTable) {
            System.out.println(hashValue);
        }
    }
}
