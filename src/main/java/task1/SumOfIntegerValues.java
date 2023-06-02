package task1;

//Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве и выводит результат.
public class SumOfIntegerValues {
    private static int getSum(int[]array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 65, 2, 8, 32, 90, 2, 10};

        System.out.println(getSum(arr));
    }
}
