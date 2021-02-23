import java.util.*;

public class Assignment_2 {
    public static void main(String args[]) {
        TreeMap<String, String> map = new TreeMap<String, String>();

        map.put("Stud2", "Pearson");
        map.put("Stud1", "Ananth");
        map.put("Stud4", "John Doe");
        map.put("Stud3", "Miller");

        System.out.println("Orginal Map content: " + map);
        System.out.println("Reverse order view of the keys: " + map.descendingKeySet());
    }

}