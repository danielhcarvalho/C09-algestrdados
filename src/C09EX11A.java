public class C09EX11A 
{
    public static void main(String[] args) 
    {
        double somatorioA = 0, serieA;
        for (int i = 1; i <= 100; i++) 
        {
            somatorioA += (double) (i + 7 * i - 6) / Math.pow(4, i - 1);

        }
        serieA = Math.cbrt(somatorioA);
        System.out.printf("A = %f", serieA);

    }
}
