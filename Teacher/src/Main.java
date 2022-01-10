import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Teacher t = new Teacher(1);
        int n = 0;
        while(n!=4) {
            System.out.println("---------------------------------------------");
            System.out.println("                FACULTY MENU                 ");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Add new teachers");
            System.out.println("2 - View teachers");
            System.out.println("3 - Increase Salary");
            System.out.println("4 - Back to Main menu");
            System.out.print("Enter your choice: ");
            n = in.nextInt();
            switch (n) {
                case 1 -> {
                   t.addnewteachers();
                }
                case 2 -> {
                    t.viewTeachers();
                }
                case 3 -> {
                    t.increaseSalary();
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

