package tasksSumSession_1.task_2;
//Задача 2 (Сложность 5/10):
//        Напишите программу на Java для создания класса "Треугольник" (Triangle), который будет иметь следующие свойства:
//        Сторона A (sideA) - вещественное число;
//        Сторона B (sideB) - вещественное число;
//        Сторона C (sideC) - вещественное число.
//        Класс "Треугольник" должен иметь методы для вычисления периметра треугольника и площади треугольника. Также класс может иметь метод для определения типа треугольника (равносторонний, равнобедренный, разносторонний).
//        В главном классе программы создайте объект класса "Треугольник" с заданными сторонами и выведите на экран периметр и площадь этого треугольника, а также его тип, используя соответствующие методы класса "Треугольник".


public class Triangle {

    double sideA;
    double sideB;
    double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getPerimeter(double sideA, double sideB, double sideC) {
        if(sideA + sideB > sideC || sideA + sideC > sideB || sideC + sideB > sideA) {
            double perimeter = sideA + sideB + sideC;
            return perimeter;
        } else {
            return 0;
        }
    }

    public double getArea(double perimeter, double sideA, double sideB, double sideC ) {
        if(sideA + sideB > sideC || sideA + sideC > sideB || sideC + sideB > sideA) {
            double area = Math.sqrt((perimeter / 2) * ((perimeter / 2) - sideA) * ((perimeter / 2) - sideB) * ((perimeter / 2) - sideC));
            return area;
        } else {
            return 0;
        }
    }

    public void getTriangleType(double sideA, double sideB, double sideC) {
        if(sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {


            if (sideA == sideB && sideA == sideC) {
                System.out.println("тип треугольника - равносторонний");
            } else if (sideA == sideB || sideA == sideC || sideC == sideB) {
                System.out.println("тип треугольника - равнобедренный");
            } else {
                System.out.println("тип треугольника - разносторонний");
            }
        } else {
            System.out.println("Треугольник с данными сторонами не существует");
        }
    }

}
