import java.util.ArrayList;

public class RAM
{
    private eRWmode mMode = eRWmode.READ;
    private int mAddress = 0;
    private ArrayList<ArrayList<Boolean>> mMemory;

    /*
        Use order:
     1. Set Address
     2. Set Read / Write mode
     3. Write Switch
     4. Read Buffer
     */
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
        // Only works in WRITE mode
        if (mMode == eRWmode.WRITE)
        {
            // Convert decimal to binary and write.
            for (int i = 0; i < 8; i++)
            {
                int remnant = decimal % 2;
                decimal = decimal / 2;

                if (remnant == 0)
                {
                    mMemory.get(mAddress).set(i, false);
                }
                else
                {
                    mMemory.get(mAddress).set(i, true);
                }
            }
        }
    }

    public int ReadBuffer()
    {
        // Only works in READ mode
        if (mMode == eRWmode.READ)
        {
            int read = 0;

            for (int i = 0; i < 8; i++)
            {
                if (mMemory.get(mAddress).get(i)) // In case of true...
                {
                    read += (int)Math.pow(2, i);
                }
            }

            return read;
        }

        return -1;
    }
}
