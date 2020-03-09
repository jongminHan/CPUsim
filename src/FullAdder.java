public class FullAdder
{
    private int mCarryOut = 0;
    private int[] mResult = new int[8];

    public void Add(int num1, int num2)
    {
        int dec = num1 + num2;

        for (int i = 0; i < 8; i++)
        {
            int remnant = dec % 2;
            dec = dec / 2;

            mResult[i] = remnant;
        }

        mCarryOut = dec;
    }

    public void MuxOff(int num)
    {
        Add(GetOutput(), num);
    }

    public int GetOutput()
    {
        int output = 0;
        for (int i = 0; i < 8; i++)
        {
            if (mResult[i] == 1)
            {
                output += (int) Math.pow(2, i);
            }
        }
        return output;
    }

    public int GetCarryOut()
    {
        return mCarryOut;
    }
}
