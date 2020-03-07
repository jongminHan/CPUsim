public class Gate
{
    public static boolean AND(boolean a, boolean b)
    {
        return a && b;
    }

    public static boolean OR(boolean a, boolean b)
    {
        return a || b;
    }

    public static boolean NAND(boolean a, boolean b)
    {
        return !(a && b);
    }

    public static boolean NOR(boolean a, boolean b)
    {
        return !(a || b);
    }

    public static boolean XOR(boolean a, boolean b)
    {
        return (a && !b) || (!a && b);
    }
}
