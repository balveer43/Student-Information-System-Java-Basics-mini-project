import java.util.Scanner;
public class Project2 {

    public static void main(String[] args) {

         // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Heading
        System.out.println("========== STUDENT INFORMATION SYSTEM ==========\n");

        // Taking Input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter College: ");
        String college = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();   // Consume newline

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.println("\n===============================================");
        System.out.println("           STUDENT INFORMATION");
        System.out.println("===============================================");
        System.out.println("Name     : " + name);
        System.out.println("College  : " + college);
        System.out.println("Branch   : " + branch);
        System.out.println("CGPA     : " + cgpa);
        System.out.println("City     : " + city);
        System.out.println("===============================================");

        sc.close();
    }
}