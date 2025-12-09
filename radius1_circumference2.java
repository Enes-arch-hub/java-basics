import java.util.Scanner;

public class radius1_circumference2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius = scanner.nextDouble();

        System.out.println("Choose operation");
        System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Circumference");
        System.out.println("Enter choice(1 or 2):");

        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                double area = Math.PI * radius * radius;
                System.out.println(" Area = PI * r * r =%2f");
                break;
            case 2:
                double circumference = 2 * Math.PI * radius;
                System.out.println("Circumference = 2*PI*r =%.2f");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
