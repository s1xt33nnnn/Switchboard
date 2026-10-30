public class Switchboard {
    private Llamada[] llamadas;
    private int numCalls;

    public Switchboard(int numMaxCalls){
        numCalls = 0;
        llamadas = new Llamada[numMaxCalls];
        for (int i = 0 ; i < llamadas.length; i++){
            llamadas[i] = null;
        }
    }

    public void registerCall(Llamada llamada) {
        llamadas[numCalls] = llamada;
    }
}
