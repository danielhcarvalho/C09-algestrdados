public class C09EX11B 
{
    public static void main(String[] args) 
    {
    double serieB = 0;
        for (int i = 1; i <= 100; i++) 
        {
            serieB += (3 * i - 2) / Math.sqrt(3 * i + 4);
        }
        serieB *= (double) 5/3;
        System.out.printf("B = %f", serieB);
    }
}
