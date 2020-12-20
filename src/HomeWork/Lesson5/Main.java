package HomeWork.Lesson5;

import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    private static final int size = 10000000;
    private static final int h =size/2;
    float[] arr = new float[size];

    public static void main(String[] args) {
        Main main = new Main();
        main.methodOne();
        main.methodTwo();



    }

    private void methodOne() {

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.4f + i/2));
        }
        System.out.println(System.currentTimeMillis() - a);

    }

    private void methodTwo() {
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println(System.currentTimeMillis() - a + "msk Время разбивки массива");

        Thread thread1 = new Thread(() ->this.methodTwoInternal(a1, 1));
        Thread thread2 = new Thread(() ->this.methodTwoInternal(a2, 2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println(String.format("Исключение в потоках %s", e.getMessage()));
        }

        long connect = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2,0,arr,h,h);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния склейки массива %s",String.valueOf(end - connect)));
        System.out.println(String.format("Завершение метода 2. Время выполнения %s", String.valueOf(end - a)));

    }

    private void methodTwoInternal(float[] a1, int number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < a1.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i/2));
        }
        System.out.println(String.format("Время выполнения потока %d равно %s", number, System.currentTimeMillis() - start));
    }
}
