import java.util.List;
import java.util.Optional;

public class FindAny {

    private List<Course> courses;

    private FindAny(List<Course> courses) {
        this.courses = courses;
    }

    private Optional<Course> getCourse() {
        Optional<Course> courseOptional = this.courses.stream()
                .filter(course -> course.getStudentQuantity() > 100)
                .findAny();
        return courseOptional;
    }

    public static void of(List<Course> courses) {
        Optional<Course> filteredCourses = new FindAny(courses).getCourse();
        System.out.println(filteredCourses.get().getName());
    }

    public static void ofControlled(List<Course> courses) {
        Optional<Course> filteredCourses = new FindAny(courses).getCourse();
        Course course = filteredCourses.orElse(new Course("Other Course", 0));
        System.out.println(course.getName());
    }

    public static void ofIfPresent(List<Course> courses) {
        Optional<Course> filteredCourses = new FindAny(courses).getCourse();
        filteredCourses.ifPresent(course -> System.out.println(course.getName()));
    }

}
