import java.util.List;
import java.util.OptionalDouble;

public class Average {

    public static void from(List<Course> courses) {
        OptionalDouble average = courses.stream()
                .mapToInt(Course::getStudentQuantity)
                .average();
        average.ifPresent(value -> System.out.println("Average of students per course: " + value));
    }

}
