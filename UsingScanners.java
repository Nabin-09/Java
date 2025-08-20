import java.util.Scanner;

public class UsingScanners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA : ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false) : ");
        boolean stud = scanner.nextBoolean();


        System.out.println("hello , "+ name);
        System.out.println("you are "+age+" years old");
        System.out.println("Your GPA is : "+gpa);
        if(stud) System.out.println("You are a student !");
        else System.out.println("You are not a student !");


    }
}
