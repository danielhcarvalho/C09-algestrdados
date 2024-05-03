public class C09EX11C 
{
    public static void main(String[] args) 
    {
        double serieC = 0;

        for (int i = 1; i <= 100; i++) 
        {
            serieC += (i * 2 + 1) * Math.sqrt(i * 3 + i + 1) / (Math.pow(5, i));
        }
        serieC = Math.pow(serieC, 2);
        System.out.printf("C = %f", serieC);
    }
}
