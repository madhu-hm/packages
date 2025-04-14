package university.faculty;

public class Faculty {
	private String name;
    private String department;
    private String designation;

    public Faculty(String name, String department, String designation) {
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }

    public String toString() {
        return "Faculty: " + name + ", " + designation + " (" + department + ")";
    }
}
