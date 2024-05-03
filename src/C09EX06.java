public class C09EX06
{
    public static void main(String[] args)
    {
        double serie = 0;

        for (int aux = 1; aux <= 20; aux++)
        {
            serie += aux / Math.sqrt(aux * 2);
        }
        serie += 10;
        System.out.printf("SERIEM = %f", serie);
    }
}
