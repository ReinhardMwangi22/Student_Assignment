public class Student {
    // Private fields
    private int studentId;
    private String name;
    private double gpa;

    // Constructor
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa ;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for gpa
    public double getGpa() {
        return gpa;
    }

    // Setter for gpa with validation
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0");
        }
    }


}

class StudentInfo{
  
    public static void main(String[] args) {
        // Example usage
        
            Student student = new Student(123, "James", 3.5);
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("GPA: " + student.getGpa());

            // Attempt to set a valid GPA
            student.setGpa(3.8);
            System.out.println("Updated GPA: " + student.getGpa());

            // Attempt to set an invalid GPA
            student.setGpa(4.5);  // This will throw an exception
    }   
    
}
