class computer
{
    public void playMusic()
    {
        System.out.println("Music playing");
    }

    public String getMeAPen(int cost)
    {
        return "Pen";
    }
}


public class methods
{
    public static void main(String[] args)
    {
        computer obj = new computer();
        obj.playMusic();

    }
}
