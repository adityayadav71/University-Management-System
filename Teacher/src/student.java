
import java.util.*;

public class student {
    private int ch_std;
    private String name;
    private String lname;
    private static final int costofcourse = 600;
    private String course="";
    Random stud_id = new Random();
    private int id;
    private int balancecharge;

    // construct : promt user to ask name and age
    public void register(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the name of student: ");
        this.name = in.next();
        System.out.print("enter the last name of student: ");
        this.lname = in.next();
        System.out.print(" 1- 1ST YEAR \n 2- 2ND YEAR \n 3- 3RD YEAR  \n 4- 4TH YEAR\n");
        System.out.print("enter the std you are currently in: ");
        this.ch_std = in.nextInt();
        this.id = stud_id.nextInt(0,10000);
    }
    // generate ID
    public void ID() {
        System.out.println(name +" "+lname+" your ID is: "+ ch_std+this.id);
    }
    //enroll in course
    public void enroll(){
        int a =0;
        while(a<1){
        System.out.print("enter the name of course you want to enroll: ");
        Scanner in = new Scanner(System.in);
        String course_u_Enroll = in.nextLine();

        if(!Objects.equals(course_u_Enroll, "q")){
            this.course = (course + "\n"+ course_u_Enroll);
            this.balancecharge = balancecharge + costofcourse;
            }
        else if(course_u_Enroll.equals("q")){
            a = a+1;
            break;
        }

        }
        System.out.println("enrolled in: "+course);
        System.out.println("the balance charge is: "+balancecharge+ " rupee");
    }

    //view balance
    public void view_balance(){
        System.out.println("the balance charge is: "+balancecharge+" rupee");
    }
    //pay tuition fees
    public void pay_balance(){
        view_balance();
        System.out.print("amount do you want to pay: ");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        if(pay>balancecharge){
            System.out.println("you can't pay more than balance fees");
                    }
        else{
        balancecharge = balancecharge - pay;
        System.out.println("payment is done!!!\nthe balance charge is: "+balancecharge+" rupee");}

    }
    //show status
        public void status(){
            System.out.println("name: "+name+"\n"+"last Name: "+ lname+ "\n"+"ID: "+ch_std+this.id+"\n"+"enroll courses: "+ course +"\n"+ "Balance Charge: "+balancecharge);
        }
}
