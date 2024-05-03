public class C09EX02
{
    public static void main(String[] args)
    {
        int denominador;
        double serie = 0;

        for (int aux = 1; aux <= 100; aux++)
        {
            denominador = (int) Math.pow(aux, 2) + aux - 1;
            serie += (float) aux/denominador;

        }
        System.out.printf("SERIED = %.1f\n", serie);
    }
}
