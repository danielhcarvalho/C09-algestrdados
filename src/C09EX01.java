public class C09EX01 {
    public static void main(String[] args) {
        int numerador, denominador;
        double serie = 0;

        for (int aux = 37; aux >= 1; aux--)
        {
            numerador = aux * (aux + 1);
            denominador = 38 - aux;

            serie += (float) numerador / denominador;        
        }
            System.out.printf("SERIEB = %f\n", serie);
    }
}