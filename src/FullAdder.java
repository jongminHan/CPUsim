public class FullAdder
{
    private int mCarryOut = 0;

    public int Add(int num1, int num2)
    {
        assert 0 <= num1 && num1 < 256 : "Number out of bound";
        assert 0 <= num2 && num2 < 256 : "Number out of bound";

        int dec = num1 + num2;
        int[] result = new int[8];

        for (int i = 0; i < 8; i++)
        {
            int remnant = dec % 2;
            dec = dec / 2;

            result[i] = remnant;
        }
        mCarryOut = dec;

        int read = 0;
        for (int i = 0; i < 8; i++)
        {
            if (result[i] == 1)
            {
                read += (int)Math.pow(2, i);
            }
        }

        return read;
    }

    public int GetCarryOut()
    {
        return mCarryOut;
    }
}
