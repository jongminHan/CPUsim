public class Register
{
    private byte mData = 0;

    public void Load(byte data)
    {
        mData = data;
    }

    public byte Store()
    {
        return mData;
    }
}
