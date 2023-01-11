import java.util.List;
import java.util.Optional;

public class FindFirst {

    public static void getFirstFromList(List<Course> courses) {
        Optional<Course> courseOptional = courses.stream().findFirst();
        courseOptional.ifPresent(course -> System.out.println(course.getName()));
    }

}
