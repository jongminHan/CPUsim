import java.util.ArrayList;

public class RAM
{
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

    public void WriteMode(int address, int input)
    {
        assert address >= 0 && address < mMemory.size() : "Address out of index";

        // Convert decimal to binary and write.
        for (int i = 0; i < 8; i++)
        {
            int remnant = input % 2;
            input = input / 2;

            if (remnant == 0)
            {
                mMemory.get(address).set(i, false);
            }
            else
            {
                mMemory.get(address).set(i, true);
            }
        }
    }

    public int ReadMode(int address)
    {
        int read = 0;

        for (int i = 0; i < 8; i++)
        {
            if (mMemory.get(address).get(i)) // In case of true...
            {
                read += (int)Math.pow(2, i);
            }
        }

        return read;
    }
}
