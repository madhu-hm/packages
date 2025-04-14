package university.students;

public class Student {
	private String name;
    private int studentId;
    private String major;

    public Student(String name, int studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public String getName() { return name; }
    public int getStudentId() { return studentId; }
    public String getMajor() { return major; }

    public String toString() {
        return "Student: " + name + " (ID: " + studentId + "), Major: " + major;
    }
}
