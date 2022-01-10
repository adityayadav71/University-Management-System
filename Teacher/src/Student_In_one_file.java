import java.util.Random;
import java.util.Scanner;

public class Student_In_one_file extends student_databaseclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Login");
        System.out.println("2 - Register");
        int op1 = in.nextInt();
        admin add = new admin();
        switch(op1){
            case 1:
                add.login();
            case 2:
                add.register();
        }
    }
}
class admin{
    String[] User_detail = new String[2];
    public void register(){
        Random rand_id = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your email ID: ");
        String email = in.nextLine();
        System.out.print("Enter your password: ");
        User_detail[0] = in.nextLine();
        User_detail[1] = String.valueOf(rand_id.nextInt(0,10000));
        System.out.println("You have registered successfully!!!!");
        System.out.println("Your ID is: "+ User_detail[1]);
        login();
    }
    public void login(){
        Scanner in = new Scanner(System.in);
        System.out.println("LOGIN:");
        System.out.print("Enter Id: ");
        String id_check = in.nextLine();
        System.out.print("Enter Password: ");
        String pass_check = in.nextLine();
        if(id_check.equals(User_detail[1]) & pass_check.equals(User_detail[0])){
            System.out.println("1 - Student");
            System.out.println("2 - Teacher");
            int i = in.nextInt();
            switch(i){
                case 1->{
                    System.out.println("You have logged in successfully...\n\n");
                    student_databaseclass.call();
                }
                case 2->{
                    System.out.println("You have logged in successfully...\n\n");
                    student_databaseclass.call2();
                }
            }
        }else{
            System.out.println("Invalid password!!!");
        }
    }
}