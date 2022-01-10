import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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

