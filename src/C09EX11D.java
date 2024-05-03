public class C09EX11D 
{
    public static void main(String[] args) 
    {
        double serieD = 0;

        for (int i = 1; i <= 100; i++) 
        {
            serieD += Math.pow(i, 3) / Math.pow(10, i - 1);
        }
        System.out.printf("D = %f", serieD);
    }
}
