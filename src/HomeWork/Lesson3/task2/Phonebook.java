package HomeWork.Lesson3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
            }

        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));

        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname))
            return book.get(surname);


        return null;

    }

}