public class Main
{
    public static void main(String[] args)
    {
        // 10 + 4 + 18 + 21 + 36 + 37 + 5
        FullAdder a = new FullAdder();
        a.Add(10, 4);
        a.MuxOff(18);
        a.MuxOff(21);
        a.MuxOff(36);
        a.MuxOff(37);
        a.MuxOff(5);

        System.out.println(a.GetOutput());
    }
}
