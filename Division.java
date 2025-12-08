public class Division {
    public static void main(String[] args)
    {
        System.out.println("Numbers divisible by 5 between 1 and 100");
        for (int i = 1; i<=100;i++){
            if(i % 5 == 0){
                System.out.println(i +"");
            }
        }
        System.out.println();
    }
}
