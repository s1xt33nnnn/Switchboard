public class Llamada {
    private int origCall;
    private int destNum;
    private int duration;
    private int timeSlot;
    private boolean local;

    public Llamada(int origCall, int destNum, int duration, int timeSlot, boolean local) {
        this.origCall = origCall;
        this.destNum = destNum;
        this.duration = duration;
        this.timeSlot = timeSlot;
        this.local = local;
    }


    @Override
    public String toString() {
        String tipo;
        if (local){
            tipo = "local ";
        } else {
            tipo = "provincial ";
        }
        return "Llamadas { " +
                "tipo= " + tipo +
                ", origCall= " + origCall +
                ", destNum= " + destNum +
                ", duration= " + duration +
                ", timeSlot= " + timeSlot +
                ", cost= " + getCost() + "€"+
                '}';
    }

    public double getCost(){
        if (local = true){
            return duration* 0.15;
        }else{
            if (timeSlot == 1){
                return duration * 0.20;
            } else if (timeSlot ==2) {
                return duration * 0.25;
            } else{
                return duration * 0.30;
            }
     }
    }
}
