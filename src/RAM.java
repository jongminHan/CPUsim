import java.util.ArrayList;

public class RAM
{
    private eRWmode mMode;
    private ArrayList<ArrayList<Boolean>> mMemory;
    private int mAddress;

    public RAM()
    {
        mMemory = new ArrayList<ArrayList<Boolean>>(8);

        for (int i = 0; i < 8; i++)
        {
            ArrayList<Boolean> bitArr = new ArrayList<Boolean>(8);
            for (int j = 0; j < 8; j++)
            {
                bitArr.add(false);
            }

            mMemory.add(bitArr);
        }
    }

    public void AddressDecoder(int address)
    {
        assert address >= 0 && address < mMemory.size() : "Address out of index";
        mAddress = address;
    }

    public void SetReadWrite(eRWmode mode)
    {
        mMode = mode;
    }

    public void WriteSwitch(int decimal)
    {
        if (mMode == eRWmode.WRITE)
        {
            for (int i = 0; i < 8; i++)
            {
                int remnant = decimal % 2;
                decimal = decimal / 2;

                if (remnant == 0)
                {
                    mMemory.get(mAddress).set(i, false);
                } else
                {
                    mMemory.get(mAddress).set(i, true);
                }
            }
        }
    }
}
