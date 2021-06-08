public class Bellandur extends Centre {

    static Bellandur bellandur;

    private Bellandur()
    {

    }


    public static Bellandur getInstance()
    {
        if(bellandur==null)
            return new Bellandur();
        return bellandur;
    }


}
