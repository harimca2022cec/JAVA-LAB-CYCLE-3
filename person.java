import java.util.Scanner;
class person {
    
    String name,address,gender;
    int age;

    person(String name,String address, String gender, int age )
    {
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.age=age;

    }

}
class employee extends person
{
    int empid,salary;
    String companyname,qualification;

    employee(int empid ,int salary, String companyname ,String qualification,String name,String address , String gender ,int age)
    {
        super(name, address, gender, age);
        this.empid=empid;
        this.salary=salary;
        this.companyname=companyname;
        this.qualification=qualification;
    }
}

class teacher extends employee
{
    int teacherid;
    String subject,department;

    teacher(int teacherid,String subject, String department,int empid,int salary,String companyname,String qualification,String name,String address, String gender,int age)
    {
        super(empid, salary, companyname, qualification, name, address, gender, age);
        this.teacherid=teacherid;
        this.department=department;
        this.subject=subject;
    }
    void display()
    {
        System.out.println("");
        System.out.println("name "+name);
        System.out.println("address "+address);
        System.out.println("gender "+gender);
        System.out.println("age "+age);
        System.out.println("employee id "+empid);
        System.out.println("salary "+salary);
        System.out.println("company name "+companyname);
        System.out.println("qualification "+qualification);
        System.out.println("teacher id "+teacherid);
        System.out.println("subject "+subject);
        System.out.println("department "+department);
    }
}
class Main{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of teachers");
        int n=sc.nextInt();
        sc.nextLine();
        teacher[] teach=new teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name ");
            String name=sc.nextLine();
            System.out.println("enter address ");
            String address=sc.nextLine();
            System.out.println("enter gender ");
            String gender=sc.nextLine();
            System.out.println("enter age ");
            int age =sc.nextInt();
            System.out.println("enter employee id ");
            int empid =sc.nextInt();
            System.out.println("enter salary ");
            int salary =sc.nextInt();
            sc.nextLine();
            System.out.println("enter company name ");
            String companyname=sc.nextLine();
            System.out.println("enter qualification ");
            String qualification=sc.nextLine();
            System.out.println("enter teacher id ");
            int teacherid =sc.nextInt();
            sc.nextLine();
            System.out.println("enter subject ");
            String subject=sc.nextLine();
            System.out.println("enter department ");
            String department=sc.nextLine();
            teach[i] = new teacher(teacherid, subject, department, empid, salary, companyname, qualification, name, address, gender, age);
        }
        for(int i=0;i<n;i++)
        {
            teach[i].display();
        }


    }
}
