import java.util.Scanner;

public class inputs_numbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers to enter?");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0,evenCount = 0,oddCount = 0;

        System.out.println("Enter" + count + "numbers:");
        for(int i = 0; i<count; i++){
            System.out.println("NUmbers" + (i+1) +":");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

            if(numbers[i]%2==0)evenCount++;
            else oddCount++;
        }
        //Displays analysis
        System.out.println("\n===ANALYSIS===");
        System.out.println("All numbers:");
        for(int i = 0; i<count; i++){
            System.out.println(""+ numbers[i]+"("+(numbers[i]%2==0?"Even":"Odd")+")");
        }
        System.out.println("\nStatistics");
        System.out.println("Total numbers:"+count);
        System.out.println("Sum:" +sum);
        System.out.println("Average:"+ (double)sum/count);
        System.out.println("Even numbers:" + evenCount);
        System.out.println("Odd numbers:"+oddCount);

    }
}
