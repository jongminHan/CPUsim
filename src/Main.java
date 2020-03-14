public class Main
{

    public static void main(String[] args)
    {
        RAM ram = new RAM();
        ProgramCounter pc = new ProgramCounter();
        FullAdder fa = new FullAdder();
        Register registerA = new Register();
        Register registerB = new Register();

        ram.WriteMode(pc.GetAddress(), eCommand.LDA, (byte) 43);
        ram.WriteMode(pc.GetAddress(), eCommand.LDB, (byte) 12);
        ram.WriteMode(pc.GetAddress(), eCommand.ADD);
        ram.WriteMode(pc.GetAddress(), eCommand.STA);

        pc.Clear();

        Line line = ram.ReadMode(pc.GetAddress());
        eCommand command = line.GetCommand();

        switch (command)
        {
            case LDA:
                registerA.Load(line.GetData());
                break;
            case LDB:
                registerB.Load(line.GetData());
                break;
            case STA:
                registerA.Store();
                break;
            case STB:
                registerB.Store();
                break;
        }
    }
}
