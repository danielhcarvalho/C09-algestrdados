public class C09EX10B
 {
    public static void main(String[] args) 
    {
        double serieB, somatorioB = 0;
        for (int i = 1; i <= 100; i++) 
        {
            somatorioB +=  (double) i * 2 / (i * 3);
        }
        serieB = 1 + Math.sqrt(somatorioB);

        System.out.printf("B = %f", serieB);
    }
}