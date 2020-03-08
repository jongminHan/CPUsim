public class RAM
{
    private Boolean[][] mMemory;
    public RAM()
    {
        mMemory = new Boolean[8][8];

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                mMemory[i][j] = false;
            }
        }
    }

    public void WriteMode(int address, int input)
    {
        assert address >= 0 && address < 8 : "Address out of index";

        // Convert decimal to binary and write.
        for (int i = 0; i < 8; i++)
        {
            int remnant = input % 2;
            input = input / 2;

            if (remnant == 0)
            {
                mMemory[address][i] = false;
            }
            else
            {
                mMemory[address][i] = true;
            }
        }
    }

    public int ReadMode(int address)
    {
        int read = 0;

        for (int i = 0; i < 8; i++)
        {
            if (mMemory[address][i]) // In case of true...
            {
                read += (int)Math.pow(2, i);
            }
        }

        return read;
    }
}
