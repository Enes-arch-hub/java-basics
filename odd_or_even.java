import java.util.Scanner;

public class odd_or_even {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number + "is an EVEN number.");
        }else{
            System.out.println(number + "is an ODD number");
        }

    }
}
