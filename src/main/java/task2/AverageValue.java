package task2;

public class AverageValue {

// Напишите программу на Java, которая находит среднее значение всех элементов в массиве с плавающей точкой и выводит результат.
    private static double getAverage(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
                result += array[i];
        }
        return (result / array.length);
    }

    public static void main(String[] args) {

        double arr[] = {1.3, 65.2, 2.1, 8, 32, 90.8, 2, 10};

        System.out.println(getAverage(arr));
    }
}
