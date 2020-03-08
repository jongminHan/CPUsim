public class Main
{
    public static void main(String[] args)
    {
        RAM ram = new RAM();

        ram.AddressDecoder(3);
        ram.SetReadWrite(eRWmode.WRITE);
        ram.WriteSwitch(54);

        ram.AddressDecoder(7);
        ram.SetReadWrite(eRWmode.WRITE);
        ram.WriteSwitch(255);

        for (int i = 0; i < 8; i++)
        {
            ram.AddressDecoder(i);
            ram.SetReadWrite(eRWmode.READ);
            System.out.println(ram.ReadBuffer());
        }
    }
}
