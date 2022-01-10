
import java.util.*;
public class student_databaseclass {
    public static void call() {
        Scanner in = new Scanner(System.in);
        student student = new student();
        int num = 0;
        while(num!=7) {
            System.out.println("---------------------------------------------");
            System.out.println("            STUDENT MENU             ");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Register Student");
            System.out.println("2 - View ID");
            System.out.println("3 - Enroll in course");
            System.out.println("4 - View balance fee");
            System.out.println("5 - Pay balance fee");
            System.out.println("6 - View Profile");
            System.out.println("7 - Back to main menu");
            num = in.nextInt();
            switch (num) {
                case 1 -> {
                    student.register();
                }
                case 2 -> {
                    student.ID();
                }
                case 3 -> {
                    student.enroll();
                }
                case 4 ->{
                    student.view_balance();
                }
                case 5 -> {
                    student.pay_balance();
                }
                case 6 -> {
                    student.status();
                }

                default ->{
                    if(num != 7){
                        System.out.println("Invalid choice");
                    }
                }
            }
        }
    }
    public static void call2() {
        Scanner in = new Scanner(System.in);
        Teacher teacher1 = new Teacher("Mr. Rahul Chaube",50000,25,"MS",1,"Computers","CSE-101, CSE-314");
        Teacher teacher2 = new Teacher("Mr. Manish Singh",90000,45,"PhD",13,"Civil","CVL-101, CVL-042");
        Teacher.teacher.add(teacher1);
        Teacher.teacher.add(teacher2);
        int n = 0;
        while(n!=4) {
            System.out.println("---------------------------------------------");
            System.out.println("                FACULTY MENU                 ");
            System.out.println("---------------------------------------------");
            System.out.println("1 - View teachers");
            System.out.println("2 - Add new teachers");
            System.out.println("3 - Increase Salary");
            System.out.println("4 - Back to Main menu");
            System.out.print("Enter your choice: ");
            n = in.nextInt();
            switch (n) {
                case 1 -> {
                    Teacher.viewTeachers();
                }
                case 2 -> {
                    Teacher.addnewteachers();
                }
                case 3 -> {
                    Teacher.increaseSalary();
                }
                default ->{
                    if(n != 4){
                        System.out.println("Invalid choice");
                    }
                }
            }
        }
    }
}