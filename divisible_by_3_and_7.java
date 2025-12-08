public class divisible_by_3_and_7 {
    public static void main(String[] args){
        System.out.println("Numbers divisible by 3 and 7 (1-100):");
        for(int i = 1;i<=100;i++){
            if(i % 3== 0 && i % 7 == 0){
                System.out.println(i +"");
            }
        }
        System.out.println();
    }
}
