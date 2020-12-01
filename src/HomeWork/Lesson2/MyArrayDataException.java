package HomeWork.Lesson2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException (String message){
        super("Не коректные данные " + message);
    }
}
