package tasksSumSession_1.task_1;
//Задача 1 (Сложность 4/10):
// Напишите программу на Java для создания класса "Студент" (Student), который будет иметь следующие свойства:
// Имя (name) - строка;
// Возраст (age) - целое число;
// Средний балл (averageGrade) - вещественное число.
// Класс "Студент" должен иметь конструкторы для инициализации объекта с именем и возрастом или с именем, возрастом и средним баллом. Также класс должен иметь методы для установки и получения значений свойств.
// В главном классе программы создайте несколько объектов класса "Студент" и продемонстрируйте их использование, например, выведя информацию о студентах на экран.
public class Student {
    private String name;
    private int age;
    private double averageGrade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
