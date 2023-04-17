class Employee {
    protected int empid;
    protected String name;
    protected double salary;
    protected String address;  
    public Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
 class Teacher extends Employee {
    private String department;
    private String subject;
    private String thought;
    
    public Teacher(int empid, String name, double salary, String address, String department, String subject, String thought) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
        this.thought = thought;
    }  
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("Thought: " + thought);
        System.out.println();
    }
}
class TeacherTest {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher(101, "John", 50000.0, "123 Main St", "Math", "Algebra", "Practice makes perfect.");
        teachers[1] = new Teacher(102, "Diya", 60000.0, "456 Elm St", "Science", "Biology", "Think like a scientist.");
        teachers[2] = new Teacher(103, "Bob", 70000.0, "789 Oak St", "English", "Literature", "Read, read, read.");
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}

