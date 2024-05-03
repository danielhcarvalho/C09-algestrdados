public class C09EX11F 
{
    public static void main(String[] args) 
    {
        double serieF = 0;

        for (int i = 1; i <= 100; i++) 
        {
            serieF += (i * 2 - 1) * Math.pow(2, i + 1) / Math.pow(i * 5 - 3, 2);
        }
        serieF = 5 * Math.sqrt(serieF);
        System.out.printf("F = %f", serieF);
    }
}
