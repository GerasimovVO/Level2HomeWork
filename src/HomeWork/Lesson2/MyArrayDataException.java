package HomeWork.Lesson2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message, Throwable cause) {
        super("Неверный формат " +  message, cause);

    }
}
