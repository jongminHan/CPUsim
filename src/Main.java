public class Main
{
    public static void main(String[] args)
    {
        RSlatch rslatch = new RSlatch();

        try
        {
            rslatch.input(false, false);
        }
        catch (InvalidIntputException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Q: " + rslatch.Q());
        System.out.println("~Q: " + rslatch.NotQ());

        try
        {
            rslatch.input(true, false);
        }
        catch (InvalidIntputException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Q: " + rslatch.Q());
        System.out.println("~Q: " + rslatch.NotQ());
    }
}
