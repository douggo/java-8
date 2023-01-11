import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStreamCollectors {

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>(
                Arrays.asList(
                        new Course("Java 8", 101),
                        new Course("SQS", 35),
                        new Course("Terraform", 18),
                        new Course("Kafka", 367),
                        new Course("Docker", 94)
                )
        );
        workingWithFindFirst(courses);
        System.out.println("----------------------");
        workingWithFindAny(courses);
        System.out.println("----------------------");
        workingWithCollect(courses);
        System.out.println("----------------------");
        workingWithAverage(courses);
    }

    public static void workingWithFindFirst(List<Course> courses) {
        FindFirst.getFirstFromList(courses);
    }

    private static void workingWithFindAny(List<Course> courses) {
        FindAny.ofControlled(courses);
        FindAny.ofIfPresent(courses);
        FindAny.of(courses);
    }

    private static void workingWithCollect(List<Course> courses) {
        Collect.asList(courses);
        Collect.asMap(courses);
        Collect.asParallelStream(courses);
    }

    private static void workingWithAverage(List<Course> courses) {
        Average.from(courses);
    }

}
