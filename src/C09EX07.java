public class C09EX07
{
    public static void main(String[] args)
    {
        double numerador, serie = 0;

        for (int aux = 1; aux * 6 + 1 <= 37; aux++)
        {
            numerador = (aux * 2 - 2) + aux * 3;
            serie += numerador / (aux * 6 + 1);

        }
        System.out.printf("%f", serie);
    }
}
