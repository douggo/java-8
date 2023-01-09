import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] Args) {
        List<Course> courses = getCourses();

        courses.sort(Comparator.comparingInt(course -> course.getStudentQuantity()));

        System.out.println();

        System.out.println("Cursos com mais de 100 alunos:");
        courses.stream()
                .filter(course -> course.getStudentQuantity() > 100)
                .forEach(course -> System.out.println(course.getName() + " | " + course.getStudentQuantity() + " alunos"));

        System.out.println();

        courses.stream()
                .map(course -> course.getStudentQuantity())
                .forEach(System.out::println);

        System.out.println("---");

        int sum = courses.stream()
                .mapToInt(Course::getStudentQuantity)
                .sum();
        System.out.println(sum + " alunos no total");

        System.out.println();

        System.out.println("Cursos com menos de 100 pessoas");
        courses.stream()
                .filter(course -> course.getStudentQuantity() < 100)
                .map(Course::getName)
                .forEach(System.out::println);


    }

    private static List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java 8", 450));
        courses.add(new Course("SQS",57));
        courses.add(new Course("Design Patterns",294));
        courses.add(new Course("Terraform",30));
        courses.add(new Course("Docker",160));
        return courses;
    }

    private static void explicationStreamFilter() {
        List<Course> courses = getCourses();
        Stream<Course> courseStream = courses.stream();
        System.out.println(courseStream.filter(course -> course.getStudentQuantity() > 100));
    }

}
