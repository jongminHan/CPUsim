public class RSlatch
{
    private boolean mIsInit;
    private boolean mQ;
    private boolean mNQ;

    public RSlatch()
    {
        mIsInit = true;
    }

    public void input(boolean reset, boolean set) throws InvalidIntputException
    {
        if (reset && !set) // true, false
        {
            mQ = false;
            mNQ = true;
            mIsInit = false;
        }
        else if (!reset && set) // false, true
        {
            mQ = true;
            mNQ = false;
            mIsInit = false;
        }
        else if (reset && set) // true, true
        {
            throw new InvalidIntputException("Invalid Input");
        }

        // false, false
        if (mIsInit)
        {
            throw new InvalidIntputException("You can't put 0 and 0 when RS-Latch is in init mode.");
        }

    }

    public boolean Q()
    {
        return mQ;
    }

    public boolean NotQ()
    {
        return mNQ;
    }
}
