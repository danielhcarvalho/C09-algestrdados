public class C09EX08 
{
        public static void main(String[] args) 
        {
        double numerador, somatorio = 0, serie;
        
        for (int i = 1; i <= 20; i++) 
        {
            numerador = (i * 2 + 1) * Math.sqrt(i * 4 + 1);
            somatorio += numerador / Math.pow(5, i);
        }
        serie = Math.pow(somatorio, 2);
        System.out.printf("SERIEO = %f", serie);
    }
}