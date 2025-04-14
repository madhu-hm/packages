package university;
import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class Main {
	public static void main(String[] args) {
        Student s1 = new Student("Madhumitha H M",23, "CSE");
        Course c1 = new Course("CB3491", "Cryptography and Network Security", 4);
        Faculty f1 = new Faculty("Dr.Vidhya", "CSE", "Assistant Professor");

        System.out.println(s1);
        System.out.println(c1);
        System.out.println(f1);
    }
}
