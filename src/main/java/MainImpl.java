import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class MainImpl {

    static Kormangla kormangla= Kormangla.getInstance();
    static Bellandur bellandur=Bellandur.getInstance();
   static Map<String,Centre> centreMap= new HashMap<String, Centre>();
   static Set<String> userList;
  static void checkAvailibilty(String workoutName)
   {
       for(Map.Entry m1:centreMap.entrySet())
       {
           Centre c=(Centre)m1.getValue();
           if(c.getWorkout().containsKey(workoutName))
           {
               List<Workout> wk= c.getWorkout().get(workoutName);
               for(Workout wk1:wk)
               {
                   System.out.println(wk1);
               }
           }
       }
   }
   public void addUser(String userName)
   {
       userList.add(userName);
   }
    public static void main(String[] args) {


      String centreName="bellandur";
        centreMap.put(centreName,bellandur);
        Map<Integer,Boolean>  availablebellandur= new HashMap<Integer, Boolean>();
        availablebellandur.put(7,true);
        availablebellandur.put(8,true);
        availablebellandur.put(9,true);
        Centre c=(Centre)centreMap.get(centreName);
        c.setValues("bellandur",7,new HashMap<String, List<Workout>>(),availablebellandur);
        c.addWorkout(centreName,"cardio",7,8,100);
        c.addWorkout(centreName,"weights",8,9,150);

        checkAvailibilty("cardio");

        c.BookSession(centreName,"cardio",7,8);
    }
}
