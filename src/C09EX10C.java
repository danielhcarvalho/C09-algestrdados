public class C09EX10C
 {
    public static void main(String[] args) 
    {
        double serieC, somatorioC = 0;
        for (int i = 1; i <= 100; i++) 
        {

            somatorioC += (double) (i * 2 - 1) / (i * 2);

        }

        serieC = (double) 1/3 * Math.pow(somatorioC, 2);
        System.out.printf("C = %f", serieC);
    }
}