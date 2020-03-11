public class FullAdder
{
    private byte mResult = 0;

    public void Add(byte num1, byte num2)
    {
        mResult = (byte) (num1 + num2);
    }

    public void MuxOff(byte num)
    {
        Add(GetOutput(), num);
    }

    public byte GetOutput()
    {
        return mResult;
    }
}
