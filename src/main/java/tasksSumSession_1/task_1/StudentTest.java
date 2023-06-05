package tasksSumSession_1.task_1;

public class StudentTest {
    public static void main(String[] args) {

        Student John = new Student();
        Student Alex = new Student("Alex", 18);
        Student Ann = new Student("Ann", 17, 67.6);

        John.setName("Johny");
        John.setAge(19);
        John.setAverageGrade(75.2);

        System.out.println("Возраст студента " + Alex.getName() +" , " + Alex.getAge() + " лет ," + " средний балл равен: " + Alex.getAverageGrade());
        System.out.println("Возраст студента " + Ann.getName() +" , " + Ann.getAge() + " лет ," + " средний балл равен: " + Ann.getAverageGrade());
        System.out.println("Возраст студента " + John.getName() +" , " + John.getAge() + " лет ," + " средний балл равен: " + John.getAverageGrade());


    }
}




