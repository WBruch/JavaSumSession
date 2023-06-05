package tasksSumSession_1.task_2;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle abc = new Triangle(0,1,1);

        double perimeter = abc.getPerimeter(abc.getSideA(), abc.getSideB(), abc.getSideC());

        double area = abc.getArea(perimeter, abc.getSideA(), abc.getSideB(), abc.getSideC());

        System.out.println("Периметр данного треугольника равен: " +  perimeter);
        System.out.println("Площадь данного треугольника равна: " +  area + " кв.ед");
        abc.getTriangleType(abc.getSideA(), abc.getSideB(), abc.getSideC());
    }
}
