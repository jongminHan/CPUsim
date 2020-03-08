public class Main
{
    public static void main(String[] args)
    {
        RAM ram = new RAM();

        ram.WriteMode(4, 34);
        ram.WriteMode(0, 25);
        ram.WriteMode(2, 64);
        ram.WriteMode(3, 255);

        for (int i = 0; i < 8; i++)
        {
            System.out.println(ram.ReadMode(i));
        }
    }
}
