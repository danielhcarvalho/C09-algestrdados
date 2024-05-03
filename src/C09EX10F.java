public class C09EX10F
 {
    public static void main(String[] args) 
    {
        double serieF = 0;
        for (int i = 1; i <= 100; i++) 
        {
            serieF += Math.pow(i, 2) / Math.pow(i * 2, 2);
        }
        System.out.printf("F = %f", serieF);
    }
}