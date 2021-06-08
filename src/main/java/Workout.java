public  class Workout {
    String workoutName;
    int seatsNo;
    int time;

    public Workout(String workoutName, int seatsNo, int time) {
        this.workoutName = workoutName;
        this.seatsNo = seatsNo;
        this.time = time;
    }


    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(int seatsNo) {
        this.seatsNo = seatsNo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
