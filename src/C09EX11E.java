public class C09EX11E 
{
    public static void main(String[] args) 
    {
        double serieE = 0;

        for (int i = 1; i <= 100; i++) 
        {
            serieE += Math.pow(i, 2) * Math.sqrt(2 * i + 3) / Math.pow(i + 1, i);
        }
        serieE *= (double) 2/3;
        System.out.printf("E = %f", serieE);
    }
}