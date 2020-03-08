public class Main
{
    public static void main(String[] args)
    {
        RAM ram = new RAM();

        ram.AddressDecoder(3);
        ram.SetReadWrite(eRWmode.WRITE);
        ram.WriteSwitch(54);


    }
}
