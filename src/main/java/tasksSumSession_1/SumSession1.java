package tasksSumSession_1;


import java.util.Arrays;

public class SumSession1 {
    //Task 1
//Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве и выводит результат.
    private static int getSum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    // Task 2
// Напишите программу на Java, которая находит среднее значение всех элементов в массиве с плавающей точкой и выводит результат.
    private static double getAverage(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return (result / array.length);
    }

// Task 3
//Напишите программу на Java, которая находит наименьший и наибольший элементы в целочисленном массиве и выводит их значения.

    private static void getMinMax(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("max value is: " + maxValue + ", min value is: " + minValue);
    }

// второй способ решения Task 3
    private static void getMinMax2(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];

        Arrays.sort(array);
        System.out.println("max value is: " + array[array.length - 1] + ", min value is: " + array[0]);
    }


// Task 4
// (Сложность 3) Напишите программу на Java, которая находит количество отрицательных элементов в целочисленном массиве и выводит результат.

    private static int getAmountOfNegativeNumbers(int[]array) {
        int count = 0;

        for (int i:
             array) {
            if (i < 0)
                count++;
        }
        return count;
    }


// Task 5
// (Сложность 3) Напишите программу на Java, которая находит индекс первого вхождения заданного элемента в строковом массиве и выводит его значение.

    private static int findFirstEntryIndex(String str, char target) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == target) {
                return i;
            }
        }

        return -1; // выводим -1 если заданное значение не встречается
    }


// Task 6
// (Сложность 5) Напишите программу на Java, которая сортирует целочисленный массив в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).


    private static int[] getSortedArray(int[]array) {

        if (array.length <= 1)
            return array;

        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);

        return merge(getSortedArray(left), getSortedArray(right));
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int resIn = 0, leftIn = 0, rightIn = 0;

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }






    public static void main(String[] args) {
        int arr[] = {-4 ,1, 65, -2, 8, 32, 0, 90, 2, 10, 399, -27,};
        String str = "Hello world , Java summary session, friday. Tel-ran Berlin, Deutschland";

//        System.out.println("Task 4. Kоличество негативных чисел в массиве равно: " + getAmountOfNegativeNumbers(arr));
//        System.out.println("Task 5. Индекс первого вхождения заданного элемента в строковом массиве равен: " + findFirstEntryIndex(str, 'D'));
//        System.out.println("Массив полученный в результате сортировки слиянием (merge sort): " + Arrays.toString(getSortedArray(arr)));
    }
}
