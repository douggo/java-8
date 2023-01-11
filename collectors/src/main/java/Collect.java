import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

    private static Stream<Course> getArrayListOfCoursesGreaterThan100(List<Course> courses) {
        return courses.stream()
                .filter(course -> course.getStudentQuantity() > 100);
    }

    public static void asList(List<Course> courses) {
        getArrayListOfCoursesGreaterThan100(courses)
                .collect(Collectors.toList())
                .forEach(course -> System.out.println(course.getName() + " has " + course.getStudentQuantity() + " students."));
    }

    public static void asMap(List<Course> courses) {
        System.out.println(getArrayListOfCoursesGreaterThan100(courses)
                .collect(Collectors.toMap(course -> course.getName(), course -> course.getStudentQuantity())));
    }

    public static void asParallelStream(List<Course> courses) {
        courses.parallelStream()
                .filter(course -> course.getStudentQuantity() > 100)
                .collect(Collectors.toList())
                .forEach(course -> System.out.println(course.getName() + " has " + course.getStudentQuantity() + " students."));
    }

}
