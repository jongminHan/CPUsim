public class ProgramCounter
{
    private int mAddress = 0;

    public int GetAddress()
    {
        int address = mAddress;
        mAddress++;

        if (mAddress >= 65_536) // Stack overflow
        {
            mAddress = 0;
        }

        return address;
    }

    public void Clear()
    {
        mAddress = 0;
    }
}
