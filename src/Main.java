public class Main
{

    public static void main(String[] args)
    {
        RAM ram = new RAM();
        ProgramCounter pc = new ProgramCounter();
        FullAdder fa = new FullAdder();
        Register registerA = new Register();
        Register registerB = new Register();

        eCommand command = eCommand.LDA;

        switch (command)
        {
            case LDA:
                registerA.Load();
                break;
            case LDB:
                registerB.Load();
                break;
            case STA:
                break;
            case STB:
                break;
            default:

        }


    }
}
