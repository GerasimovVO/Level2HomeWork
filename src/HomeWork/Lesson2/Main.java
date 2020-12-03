package HomeWork.Lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] goodArray = new String[4][4];
        for (int i = 0; i < goodArray.length; i++) {
            for (int j = 0; j < goodArray.length; j++) {
                int r =(int)(Math.random()*10) + 1;
                goodArray[i][j] = String.valueOf(r);

            }
        }

        System.out.println(sumElementArray(goodArray));

    }

    public static int  sumElementArray (String[][] array) throws MyArrayDataException, MySizeArrayException {
        int value;
        int sum = 0;

        if (array.length != 4 || array[0].length != 4){
            throw new MySizeArrayException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try{
                    value = Integer.parseInt(array[i][j]);
                    sum += value;

                } catch (NumberFormatException e) {
                    String message = "в ячейке [" +String.valueOf(i) + "][" + String.valueOf(j)  + "]";
                    throw new MyArrayDataException(message);
                }

            }

        }
        return sum;
    }
}
