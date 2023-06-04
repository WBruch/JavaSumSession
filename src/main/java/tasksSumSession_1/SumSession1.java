package tasksSumSession_1;

//Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве и выводит результат.
public class SumSession1 {
    private static int getSum(int[] array) {
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


    public class SmallestAndLargestElements {

//Напишите программу на Java, которая находит наименьший и наибольший элементы в целочисленном массиве и выводит их значения.




    }


}
