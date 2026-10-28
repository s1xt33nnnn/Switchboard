public class Llamadas {
    private int origCall;
    private int destNum;
    private int duration;
    private int timeSlot;

    public Llamadas(int origCall, int destNum, int duration, int timeSlot) {
        this.origCall = origCall;
        this.destNum = destNum;
        this.duration = duration;
        this.timeSlot = timeSlot;
    }


    @Override
    public String toString() {
        return "Llamadas{" +
                "origCall=" + origCall +
                ", destNum=" + destNum +
                ", duration=" + duration +
                ", timeSlot=" + timeSlot +
                '}';
    }
}
