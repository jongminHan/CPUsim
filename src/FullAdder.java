public class FullAdder
{
    private int mCarryOut = 0;
    private int mCalOutput = 0;

    public void Add(int num1, int num2)
    {
        assert 0 <= num1 && num1 < 256 : "Number out of range";
        assert 0 <= num2 && num2 < 256 : "Number out of range";

        int dec = num1 + num2;
        int[] result = new int[8];

        for (int i = 0; i < 8; i++)
        {
            int remnant = dec % 2;
            dec = dec / 2;

            result[i] = remnant;
        }
        mCarryOut = dec;
        mCalOutput = 0;
        for (int i = 0; i < 8; i++)
        {
            if (result[i] == 1)
            {
                mCalOutput += (int)Math.pow(2, i);
            }
        }
    }

    public void MuxOff(int num)
    {
        assert 0 <= num && num < 256 : "Number out of range";

        Add(mCalOutput, num);
    }

    public int GetOutput()
    {
        return mCalOutput;
    }

    public int GetCarryOut()
    {
        return mCarryOut;
    }
}
