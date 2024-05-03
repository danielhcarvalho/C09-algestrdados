public class C09EX12 
{
 public static void main(String[] args) 
 {
    double serie = 0;

    for (int i = 1; i <= 10000; i++) 
    {

        if (i % 2 == 0) 
        {
            serie -=  (double) 1 / (i * 2 - 1);        
        }
        else
        {
            serie +=  (double) 1 / (i * 2 - 1); 
    

        }
    }
    serie *= 4;
    System.out.printf("%.4f", serie);
    
 }   
}