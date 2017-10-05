import java.util.Scanner;

public class SomethingAboutYou {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        String prompt = "Would you like to continue?";
        String input;

        String firstName;
        int age;
        String height;
        double gpa;

        System.out.println("What is your first name?");
        firstName = sc.next();

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("How tall are you?");
        height = sc.next();

        System.out.println("What is your GPA?");
        gpa = sc.nextDouble();

        //Prompt the user if they want to continue
        do
        {
            System.out.println("Do you want to continue?");
            input= sc.nextLine();

            //User inputs value that is not 'Y' or 'N'
            if((!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")))
            {
                System.out.println("Invalid entry! Please type Y or N");
                System.out.println("Do you want to continue?");
            }

            sc.nextLine();
            System.out.println("");

        }while((input.equalsIgnoreCase("y")&& !input.equalsIgnoreCase("n")));

        System.out.println("Thank you!");
    }
}



