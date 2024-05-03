public class C09EX10E
 {
    public static void main(String[] args) 
    {
        double serieE = 0;
        for (int i = 1; i <= 100; i++) 
        {
            serieE +=(double) i / (3 * i * 2);
        }

        System.out.printf("E = %f", serieE);
    }
}