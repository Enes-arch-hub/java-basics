public class Switch_statement {
    public static void main(String[] args)
    {
       /* int n = 7;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
        }*/
        String day = "Monday";
        switch (day)
        {
            case "Saturday", "Sunday":
                System.out.println("6am");
                break;
            case "Monday":
                System.out.println("8am");
                break;
            default:
                System.out.println("7am");
        }



    }

}
