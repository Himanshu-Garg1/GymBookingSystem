public class User {
    String userName;
    int time;
    String Centre;
    String workoutName;

    public User(String userName, int time, String centre, String workoutName) {
        this.userName = userName;
        this.time = time;
        Centre = centre;
        this.workoutName = workoutName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCentre() {
        return Centre;
    }

    public void setCentre(String centre) {
        Centre = centre;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }
}
