public class Course {

    private String name;
    private int studentQuantity;

    public Course(String name, int studentQuantity) {
        this.name = name;
        this.studentQuantity = studentQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public void setStudentQuantity(int studentQuantity) {
        this.studentQuantity = studentQuantity;
    }
}
