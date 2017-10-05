import java.util.Scanner;

public class SomethingAboutYou {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        String input;

        String firstName;
        int age;
        String height;
        double gpa;

        do
        {

        System.out.println("What is your first name?");
        firstName = sc.next();

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("How tall are you?");
        height = sc.next();

        System.out.println("What is your GPA?");
        gpa = sc.nextDouble();

        System.out.println("First Name:" +firstName+ "Age:" +age+ "Height:" +height+ "GPA:"+gpa);

        //Prompt the user if they want to continue

            System.out.println("Do you want to continue?");
            input= sc.next();
            if(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")){
                System.out.println("");
            }
            if(input.equalsIgnoreCase("n")){
                System.out.println("Thank you!");
            }

            sc.nextLine();
            System.out.println("");

        }while(!input.equalsIgnoreCase("n"));

    }
}



