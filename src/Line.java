public class Line
{
    private eCommand mCommand;
    private byte mData;

    public Line(eCommand command, byte data)
    {
        mCommand = command;
        mData = data;
    }

    public Line(eCommand command)
    {
        mCommand = command;
        mData = 0;
    }

    public eCommand GetCommand()
    {
        return mCommand;
    }

    public byte GetData()
    {
        return mData;
    }
}
