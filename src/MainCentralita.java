public class MainCentralita {
    public static void main(String[] args) {
        Llamada llamadas[]= new Llamada[100];
        llamadas[0] = new Llamada( 34, 626356993, 353, 1,true);
        llamadas[1] = new Llamada( 34, 700760863, 463, 1,true);
        llamadas[2] = new Llamada( 34, 794224129, 60, 1, false);
        llamadas[3] = new Llamada( 34, 799287475, 49, 1, false);
        llamadas[4] = new Llamada( 34, 716257518, 121, 1, false);
        llamadas[5] = new Llamada( 34, 644223262, 946, 1, false);
        llamadas[6] = new Llamada( 34, 753588685, 1845, 1, true);
        llamadas[7] = new Llamada( 34, 610954895, 4963, 1, true);
        for (int i = 0; i < llamadas.length; i++){
            System.out.println(llamadas[i]);
        }

    }
}
