public class Course {

    private String name;

    private Integer studentQuantity;

    public Course(String name, Integer studentQuantity) {
        this.name = name;
        this.studentQuantity = studentQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentQuantity() {
        return studentQuantity;
    }

    public void setStudentQuantity(Integer studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

}
