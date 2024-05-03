public class C09EX13 
{
    public static void main(String[] args) 
    {
        long fatorial = 1;
        double serieDesafio = 0, termo;

        for (int i = 1; i <= 10; i++) 
        {
            fatorial *= i;
            termo = fatorial /( Math.pow(2, i) - 1);    
            
            if (i % 2 == 0)
            {
                serieDesafio -= termo;
            }
            else
            {
                serieDesafio += termo;
            }
        }
        System.out.printf("SERIE DESAFIO = %f", serieDesafio);
    }
}
