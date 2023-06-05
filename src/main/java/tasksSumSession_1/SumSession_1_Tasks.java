package tasksSumSession_1;


import java.util.Arrays;

public class SumSession_1_Tasks {
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

    private static int getAmountOfNegativeNumbers(int[] array) {
        int count = 0;

        for (int i :
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

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                return i;
            }
        }

        return -1; // выводим -1 если заданное значение не встречается
    }


// Task 6
// (Сложность 5) Напишите программу на Java, которая сортирует целочисленный массив в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).


    private static int[] getSortedArray(int[] array) {

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


// Task 7
// (Сложность 5) Напишите программу на Java, которая находит наиболее часто встречающийся элемент в целочисленном массиве и выводит его значение.

    private static int getFrequentElement(int[] array) {

        int[] frequency = new int[array.length];
        int totalCounter = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            int temp = array[i];
            for (int j = 0; j < array.length; j++) {
                if (temp == array[j]) {
                    counter++;
                }
            }
            frequency[i] = counter;
            if (counter > totalCounter)
                totalCounter = counter;
        }

        int result = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == totalCounter ) {
                result = array[i];
            }
        }

        System.out.println(Arrays.toString(frequency));

        return result;
    }


//Task 8
//(Сложность 5) Напишите программу на Java, которая объединяет два отсортированных целочисленных массива в один отсортированный массив, используя алгоритм слияния (merge).


    private static int[] getOneSortedFromTwo(int[] arrA, int[] arrB) {

        int [] sortedArray = new int[arrA.length + arrB.length];
        int k = 0, i = 0, j = 0;

        while (i < arrA.length && j < arrB.length) {
            if (arrA[i] <= arrB[j]) {
                sortedArray[k++] = arrA[i++];
            } else {
                sortedArray[k++] = arrB[j++];
            }
        }

        while (i < arrA.length) {
            sortedArray[k++] = arrA[i++];
        }
        while (j < arrB.length) {
            sortedArray[k++] = arrB[j++];
        }

        return sortedArray;
    }

// Task 9
//(Сложность 5) Напишите программу на Java, которая находит наибольшую возрастающую последовательность в целочисленном массиве и выводит ее значения.


    private static void getLongestIncreasingSequence(int[] array) {
        int[] lengthOfSubsequence = new int[array.length];
        Arrays.fill(lengthOfSubsequence, 1);
        int maxLenght = 1;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    if (lengthOfSubsequence[i] <= lengthOfSubsequence[j]) {
                        lengthOfSubsequence[i] = lengthOfSubsequence[j] +1;
                        if (maxLenght < lengthOfSubsequence[i]) {
                            maxLenght = lengthOfSubsequence[i];
                        }
                    }
                }
            }
        }

//        int[] longestIncreasingSequence = new int[maxLenght];
//        int index = 0;
//        while (maxLenght != -1) {
//                longestIncreasingSequence[index] =
     //   }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(lengthOfSubsequence));
        System.out.println(maxLenght);

        // нашёл наибольшую возрастающую последовательность, но не могу её вывести.
    }



// Task 10
// (Сложность 5) Напишите программу на Java, которая находит пару элементов в целочисленном массиве, сумма которых равна заданному числу, и выводит их значения.


    private static void getPairFromSum(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("пара чисел сумма которых равна " + sum + " это числа: " + array[i] + " и " + array[j]);
                }
            }
        }

    }







    public static void main(String[] args) {
        int arr[] = {-4, 1, 65, -2, 8, 32, 0, 90, 8, 2, 10, 399, -27, 8};
        int arr1[] = {-4, -1, 0, 2, 8, 32,};
        int arr2[] = {4, 6, 10, 12, 18, 32,};
        int arr3[] = {0, 2, 1, 3, 1, 5, 2, 8, 0};
        String str = "Hello world , Java summary session, friday. Tel-ran Berlin, Deutschland";

//        System.out.println("Task 4. Kоличество негативных чисел в массиве равно: " + getAmountOfNegativeNumbers(arr));
//        System.out.println("Task 5. Индекс первого вхождения заданного элемента в строковом массиве равен: " + findFirstEntryIndex(str, 'D'));
//        System.out.println("Task 6. Массив полученный в результате сортировки слиянием (merge sort): " + Arrays.toString(getSortedArray(arr)));
//        System.out.println("Task 7. Hаиболее часто встречающийся элемент в целочисленном массиве: " + getFrequentElement(arr));
//        System.out.println("Task 8. Итоговый массив после слияния двух отсортированных массивов: " + Arrays.toString(getOneSortedFromTwo(arr2, arr1)));
//        getLongestIncreasingSequence(arr3);
//        getPairFromSum(arr3, 5);  // Task 10
    }
}
