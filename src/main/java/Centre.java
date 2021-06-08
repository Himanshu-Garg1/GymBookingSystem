import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Centre {

    String centreName;
    int slotsNo;
    Map<String, List<Workout> > workout;
    Map<Integer,Boolean> availibilty;
    public Map<Integer, Boolean> getAvailibilty() {
        return availibilty;
    }

    public void setAvailibilty(Map<Integer, Boolean> availibilty) {
        this.availibilty = availibilty;
    }


    public void addWorkout(String centreName, String workoutName,int fromtime, int totime, int seats){

        centreName=centreName;
        Workout workout1= new Workout(workoutName,seats,fromtime);
        if(availibilty.containsKey(fromtime))
        {
            if(workout.containsKey(workoutName))
            {
                List<Workout> workoutList=workout.get(workoutName);
                workoutList.add(workout1);
                workout.put(workoutName,workoutList);
            }
            else
            {
                List<Workout> workoutList=new ArrayList<Workout>();
                workoutList.add(workout1);
                workout.put(workoutName,workoutList);

            }
        }


        else
        {
            System.out.println("this timings doesnot exist");
        }

    }

    public void BookSession(String centreName, String workoutName,int fromtime, int totime)
    {
        if(availibilty.containsKey(fromtime))
        {
            if(workout.containsKey(workoutName)) {
                List<Workout> workoutList = workout.get(workoutName);
                for (int i=0;i<workoutList.size();i++)
                {
                    if(workoutList.get(i).time==fromtime)
                    {
                        Workout wk1=workoutList.get(i);
                        wk1.seatsNo--;
                        workoutList.set(i,wk1);
                        workout.put(workoutName,workoutList);
                        return;
                    }
                }
            }
        }
    }


    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

    public int getSlotsNo() {
        return slotsNo;
    }

    public void setSlotsNo(int slotsNo) {
        this.slotsNo = slotsNo;
    }

    public Map<String, List<Workout>> getWorkout() {
        return workout;
    }

    public void setWorkout(Map<String, List<Workout>> workout) {
        this.workout = workout;
    }


    public void setValues(String centreName,  int slotsNo, Map<String, List<Workout> > workout,  Map<Integer,Boolean> availibilty)
    {
        this.centreName=centreName;
        this.availibilty=availibilty;
        this.workout=workout;
        this.slotsNo=slotsNo;
    }
}
