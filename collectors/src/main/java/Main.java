import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

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
        workingWithFindAny(courses);
        System.out.println("----------------------");
        workingWithCollect(courses);
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

}
