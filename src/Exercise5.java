public class Exercise5 {
    public static void main(String[] args) {
        Switchboard centralita = new Switchboard(1000);
        centralita.registerCall(new Llamada(55512121, 55521212, 30, 1, true));
        centralita.registerCall(new Llamada(55512122, 55521213, 60, 2, false));
        centralita.registerCall(new Llamada(55512123, 55521214, 90, 2, true));
        centralita.registerCall(new Llamada(55512124, 55521215, 120, 3, true));
        centralita.registerCall(new Llamada(55512125, 55521216, 88, 1, false));

        System.out.println("Numero total de llamadas: " + centralita.getNumCalls());
        System.out.println("Coste total de llamada: " + centralita.getTotalCost());
    }
}
