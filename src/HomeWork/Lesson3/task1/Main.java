package HomeWork.Lesson3.task1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Mercedes", "BMW", "Audi", "Toyota", "Vokswagen", "Subaru",
                "Range rover", "Opel", "Lada", "Toyota", "Vokswagen", "BMW",
                "Audi", "Toyota", "Subaru", "Audi", "Subaru", "Lada",
                "BMW", "Range rover", "Opel"

        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаимости слов:");
        for (String key : unique){
            System.out.println(key + ": " + Collections.frequency(words, key));
        }




    }
}