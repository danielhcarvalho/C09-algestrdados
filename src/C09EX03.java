public class C09EX03
{
    public static void main(String[] args)
    {
        double numerador, denominador,serie = 0;
        for (int aux = 1; aux <= 20; aux++)
        {
            numerador = 1 + Math.sqrt(aux * 4);
            denominador = aux * 3;
            serie += numerador / denominador;

        }
        System.out.printf("SERIEN = %.4f\n", serie);
    }
}
