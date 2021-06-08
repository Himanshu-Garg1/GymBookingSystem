import java.util.List;
import java.util.Map;

public class Kormangla extends Centre {

   static Kormangla kormangla;
    private Kormangla()
    {

    }


    public static Kormangla getInstance()
    {
        if(kormangla==null)
            return new Kormangla();
        return kormangla;
    }




}
