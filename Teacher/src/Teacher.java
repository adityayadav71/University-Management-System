import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Teacher{
    private int id;
    int age;
    long Salary;
    int workexperience;
    public String Name;
    String Qualification;
    String Department;
    private String coursesTaught = "";
    static ArrayList<Teacher> teacher = new ArrayList<>(2);
    public Teacher(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.Name = in.next();
        System.out.print("Enter Salary: ₹");
        this.Salary = in.nextInt();
        System.out.print("Enter Age: ");
        this.age = in.nextInt();
        System.out.print("Enter Qualification: ");
        this.Qualification = in.next();
        System.out.print("Enter number of years experienced: ");
        this.workexperience = in.nextInt();
        System.out.print("Enter Department: ");
        this.Department = in.next();
    }
    public Teacher(String Name, int Salary, int age, String Qualification,int workexperience, String Department, String courses) {
        this.setId();
        this.Name = Name;
        this.Salary =  Salary;
        this.age = age;
        this.workexperience = workexperience;
        this.Qualification = Qualification;
        this.Department = Department;
        this.coursesTaught = courses;
    }
    public void setcoursesTaught(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter courses taught(Q to Quit): ");
        do{
        String courses = in.nextLine();
            if(!courses.equals("Q")) {
                this.coursesTaught = this.coursesTaught + courses;
            }else{
                break;
            }
        }while(true);
    }
    public String getcoursestaught(){
        return this.coursesTaught;
    }
    public void setId(){
        Random rn = new Random();
        this.id = rn.nextInt(0,10000);
    }
    public int getId(){
        return this.id;
    }
    public static void addnewteachers(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of new teachers to add: ");
        int newTeachers = in.nextInt();
        System.out.println("---------------------------------------------");
        teacher.trimToSize();
        for (int i = 2; teacher.size() < newTeachers + 2; i++) {
            Teacher teacher3 = new Teacher();
            teacher.add(teacher3);
            teacher.get(i).setId();
            System.out.println("Generated Teacher ID: " + teacher.get(i).getId());
            teacher.get(i).setcoursesTaught();
            System.out.println("Added teacher " + teacher.get(i).Name + " succesfully");
        }
    }
    public static void viewTeachers(){
        for (Teacher value : teacher) {
            System.out.println("ID:             " + value.getId() + "\n" + "Name:           " + value.Name + "\n" +"Courses taught: " + value.getcoursestaught() + "\n" +"Department:     " + value.Department + "\n" +"Qualification:  " + value.Qualification);
            System.out.println("---------------------------------------------");
        }
    }
    public static void increaseSalary() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - By ID");
        System.out.println("2 - By Experience");
        System.out.print("Enter your choice: ");
        int incr = in.nextInt();
        switch (incr) {
            case 1 -> {
                System.out.print("Enter Teachers' ID: ");
                int ID = in.nextInt();
                Teacher selected = new Teacher();
                for (Teacher value : Teacher.teacher) {
                    if(value.id == ID) {
                        selected = value;
                    }else{System.out.println("No such ID exists...");}
                }
                    for (Teacher value : teacher) {
                        if (value.getId() == ID) {
                            System.out.print("Current Salary: " + value.Salary);
                            System.out.print("\nIncrement percentage: ");
                            float percent = in.nextFloat();
                            value.Salary += value.Salary * 0.01 * percent;
                            System.out.print("Increased Salary: " + value.Salary + "\n");
                        }
                    }
            }
            case 2 -> {
                System.out.print("Enter criteria(workexperience): ");
                int c = in.nextInt();
                System.out.print("Increment Percentage: ");
                float percent = in.nextFloat();
                for (Teacher value : teacher) {
                    if (value.workexperience >= c) {
                        value.Salary += value.Salary * 0.01 * percent;
                        System.out.println("Salary Increased to " + value.Salary + " for ID = " + value.getId());
                    }
                }
            }
        }
    }
}
