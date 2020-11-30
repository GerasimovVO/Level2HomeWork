package HomeWork.Lesson3.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Жигалов", "89569652426");
        phonebook.add("Жигалов", "89547665654");
        phonebook.add("Иванов", "84567541495");
        phonebook.add("Сидоров", "84267851945");
        phonebook.add("Рагозин", "89034568574");
        phonebook.add("Шмелев", "89023654674");
        phonebook.add("Иванченко", "89045216578");
        phonebook.add("Иванов", "89078546148");
        phonebook.get("Жигалов");
        phonebook.get("Иванов");

    }
}
