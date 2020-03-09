public class Main
{
    public static void main(String[] args)
    {
        RAM ram = new RAM();

        ram.WriteMode(34, (byte)2);
        ram.WriteMode(35, (byte)-53);
        ram.WriteMode(36, (byte)255);


        System.out.println(ram.ReadMode(34));
        System.out.println(ram.ReadMode(35));
        System.out.println(ram.ReadMode(36));

    }
}
